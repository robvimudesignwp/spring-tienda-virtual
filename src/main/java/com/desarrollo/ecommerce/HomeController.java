
package com.desarrollo.ecommerce;

import com.desarrollo.ecommerce.model.DetalleOrden;
import com.desarrollo.ecommerce.model.Orden;
import com.desarrollo.ecommerce.model.Producto;
import com.desarrollo.ecommerce.service.ProductoService;
import java.util.ArrayList;
import java.util.List;
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
    
    List<DetalleOrden> detalles = new ArrayList<DetalleOrden>();//almacenamos los detalles de la orden de compra
    
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
    public String addCart(@RequestParam Integer id, @RequestParam Integer cantidad ){
        
        DetalleOrden detalleOrden = new DetalleOrden();
        Producto producto = new Producto();
        double sumaTotal = 0; //la variable siempre iniciará en 0
        
        Optional<Producto> optionalProducto = productoService.get(id);
        log.info("Producto añadido: {}", optionalProducto.get());
        log.info("Cantidad: {}", cantidad);
        
        return "usuario/carrito";
    }
}
