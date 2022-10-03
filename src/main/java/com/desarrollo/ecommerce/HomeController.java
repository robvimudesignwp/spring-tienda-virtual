
package com.desarrollo.ecommerce;

import com.desarrollo.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author rober Home Controller
 */

@Controller
@RequestMapping("/")
public class HomeController {
    
    @Autowired 
    private ProductoService productoService; //Acceder a los productos agregados desde el admin
    
    @GetMapping("")
    public String home(Model model){
        model.addAttribute("productos", productoService.findAll());
        return "usuario/home";
    }
}
