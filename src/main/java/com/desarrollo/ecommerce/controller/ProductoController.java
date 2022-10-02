
package com.desarrollo.ecommerce.controller;

import com.desarrollo.ecommerce.model.Producto;
import com.desarrollo.ecommerce.model.Usuario;
import com.desarrollo.ecommerce.service.ProductoService;
import com.desarrollo.ecommerce.service.UploadFileService;
import java.io.IOException;
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
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author rober
 */

@Controller
@RequestMapping("/productos")
public class ProductoController {
    
    private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);
    
    @Autowired
    private ProductoService productoService;
    
    @Autowired
    private UploadFileService upload;
    
    @GetMapping("")
    public String show(Model model){
        model.addAttribute("productos", productoService.findAll());
        return "productos/itemproduct";
    }
    
    @GetMapping("/createproduct")
    public String create(){
        return "productos/createproduct";
    }
    
    @PostMapping("/save")
    public String save(Producto producto,@RequestParam("imagen") MultipartFile file) throws IOException{
        LOGGER.info("Este es el objeto producto {}", producto);
        Usuario u = new Usuario(1, "", "", "", "", "", "", "");
        producto.setUsuario(u);
        
        /**
         * Subiendo la imagen del producto
         */
        if(producto.getId() == null){ //validación al crear el producto
            String nombreImagen = upload.saveImage(file); //apuntamos a la clase de servicio
            producto.setImagen(nombreImagen); //guardamos la imagen dentro de la tabla producto en la BD
        }else{
            if(file.isEmpty()){//acción si se edita el producto, pero se deja la misma imagen
               Producto p = new Producto();
               p = productoService.get(producto.getId()).get();//obtenemos el producto
               producto.setImagen(p.getImagen());
            }else{//acción si se edita el producto y cambiamos la imagen
               String nombreImagen = upload.saveImage(file); //apuntamos a la clase de servicio
               producto.setImagen(nombreImagen); //guardamos la imagen dentro de la tabla producto en la BD
            }
        }
        
        productoService.save(producto);
        return "redirect:/productos";
    }
    
    @GetMapping("/editproduct/{id}")
    public String edit(@PathVariable Integer id, Model model){
        Producto producto = new Producto();
        Optional<Producto> optionalProducto = productoService.get(id);
        producto = optionalProducto.get();
        
        LOGGER.info("Producto buscado:{}", producto);
        model.addAttribute("producto", producto);
        
        return "productos/editproduct";
    }
    
    @PostMapping("/update")
    public String update(Producto producto){
        productoService.update(producto);
        return "redirect:/productos";
    }
    
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        productoService.delete(id);
        return "redirect:/productos";
    }
}
