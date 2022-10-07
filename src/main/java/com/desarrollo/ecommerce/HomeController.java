
package com.desarrollo.ecommerce;

import com.desarrollo.ecommerce.model.DetalleOrden;
import com.desarrollo.ecommerce.model.Orden;
import com.desarrollo.ecommerce.model.Producto;
import com.desarrollo.ecommerce.model.Usuario;
import com.desarrollo.ecommerce.service.InterfaceUsuarioService;
import com.desarrollo.ecommerce.service.ProductoService;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author rober Home Controller
 */

@Controller
@RequestMapping("/")
public class HomeController {
    
    private final Logger log = LoggerFactory.getLogger(HomeController.class);
    
    @Autowired 
    private ProductoService productoService; //Acceder a los productos agregados desde el admin
    
    @Autowired
    private InterfaceUsuarioService usuarioService;
    
    List<DetalleOrden> detalles = new ArrayList<>();//almacenamos los detalles de la orden de compra
    
    Orden orden = new Orden();
    
    @GetMapping("")
    public String home(Model model){
        model.addAttribute("productos", productoService.findAll());
        return "usuario/home";
    }
    
    @GetMapping("productohome/{id}")
    public String productoHome(@PathVariable Integer id, Model model){ //mostramos el producto por el id
        
        log.info("Id producto enviado como parametro {}", id);
        Producto producto = new Producto();
        Optional<Producto> productoOptional = productoService.get(id);
        producto = productoOptional.get();
        model.addAttribute("producto", producto);
        
        return "usuario/productohome";
    }
    
    @PostMapping("/carrito")
    public String addCart(@RequestParam Integer id, @RequestParam Double cantidad, Model model ){
        
        DetalleOrden detalleOrden = new DetalleOrden();
        Producto producto = new Producto();
        double sumaTotal = 0; //la variable siempre iniciará en 0
        
        Optional<Producto> optionalProducto = productoService.get(id);
        log.info("Producto añadido: {}", optionalProducto.get());
        log.info("Cantidad: {}", cantidad);
        producto = optionalProducto.get();
        
        detalleOrden.setCantidad(cantidad);
        detalleOrden.setPrecio(producto.getPrecio());
        detalleOrden.setNombre(producto.getNombre());
        detalleOrden.setTotal(producto.getPrecio() * cantidad);
        detalleOrden.setProducto(producto);
        
        /**
         * Validamos que el producto no se agregue dos veces
         */
        Integer idProducto = producto.getId();
        Boolean ingresado = detalles.stream().anyMatch(p -> {
            return p.getProducto().getId()== idProducto;
        });
        
        if(!ingresado){
            detalles.add(detalleOrden);
        }
        
        detalles.add(detalleOrden);
        
        sumaTotal = detalles.stream().mapToDouble(dt -> dt.getTotal()).sum(); //sumamos todos los valores
        
        orden.setTotal(sumaTotal);
        model.addAttribute("carrito", detalles);
        model.addAttribute("orden", orden);
             
        return "usuario/carrito";
    }
    
    /**
     * Eliminar un producto seleccionado del carrito de compras
     * @param id
     * @param model
     * @return 
     */
    
    @GetMapping("/delete/carrito/{id}")
    public String deleteProductoCarrito(@PathVariable Integer id, Model model){
        
        //Lista nueva de productos
        List<DetalleOrden> ordenesNuevas = new ArrayList<>();
        
        for(DetalleOrden detalleOrden: detalles){
            if(!Objects.equals(detalleOrden.getProducto().getId(), id)){
                ordenesNuevas.add(detalleOrden);
            }
        }
        
        //Agregamos una nueva lista con los productos restantes
        detalles = ordenesNuevas;
        
        //Recalculamos los productos
        double sumaTotal = 0;
        sumaTotal = detalles.stream().mapToDouble(dt -> dt.getTotal()).sum();
        
        orden.setTotal(sumaTotal);
        model.addAttribute("carrito", detalles);
        model.addAttribute("orden", orden);
        
        return "usuario/carrito";
    }
    
    @GetMapping("/getCarrito")
    public String getCarrito(Model model){
        model.addAttribute("carrito", detalles);
        model.addAttribute("orden", orden);
        
        return "usuario/carrito";
    }
    
    @GetMapping("/ordenCompra")
    public String ordenCompra(Model model){
        Usuario usuario = usuarioService.findById(3).get();
        model.addAttribute("carrito", detalles);
        model.addAttribute("orden", orden);
        model.addAttribute("usuario", usuario);
        return "usuario/resumenorden";
    }
}
