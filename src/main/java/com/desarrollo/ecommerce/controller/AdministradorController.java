
package com.desarrollo.ecommerce.controller;


import com.desarrollo.ecommerce.model.Producto;
import com.desarrollo.ecommerce.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author rober
 */

@Controller
@RequestMapping("/administrador")
public class AdministradorController {
    
    @Autowired
    private ProductoService productoService;
    
    @GetMapping("")
    public String home(Model model){
        
        /**
         * Metodo para obtener las imágenes de los productos 
         * y mostrarlas en el home
         */
        
        List<Producto> productos = productoService.findAll();
        model.addAttribute("productos", productos);
        
        
        return "administrador/home";
    }
}


