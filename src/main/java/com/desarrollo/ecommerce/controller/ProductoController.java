
package com.desarrollo.ecommerce.controller;

import com.desarrollo.ecommerce.model.Producto;
import com.desarrollo.ecommerce.model.Usuario;
import com.desarrollo.ecommerce.service.ProductoService;
import java.util.Optional;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @Autowired
    private ProductoService productoService;
    
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
    public String save(Producto producto){
        LOGGER.info("Este es el objeto producto {}", producto);
        Usuario u = new Usuario(1, "", "", "", "", "", "", "");
        producto.setUsuario(u);
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
