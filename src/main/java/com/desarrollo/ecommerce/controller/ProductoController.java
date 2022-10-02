
package com.desarrollo.ecommerce.controller;

import com.desarrollo.ecommerce.model.Producto;
import com.desarrollo.ecommerce.model.Usuario;
import com.desarrollo.ecommerce.service.ProductoService;
import org.slf4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author rober
 */

@Controller
@RequestMapping("/productos")
public class ProductoController {
    
    private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);
    
    private ProductoService productoService;
    
    @GetMapping("")
    public String show(){
        return "productos/itemproduct";
    }
    
    @GetMapping("/createproduct")
    public String create(){
        return "productos/createproduct";
    }
    
    @PostMapping("/save")
    public String save(Producto producto){
        LOGGER.info("Este es el objeto producto {}", producto);
        Usuario u = new Usuario(1, "", "", "", "", "", "", "");
        producto.setUsuario(u);
        productoService.save(producto);
        return "redirect:/productos";
    }
}
