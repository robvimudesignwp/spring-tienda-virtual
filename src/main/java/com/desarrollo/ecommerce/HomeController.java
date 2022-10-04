
package com.desarrollo.ecommerce;

import com.desarrollo.ecommerce.service.ProductoService;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
    
    @GetMapping("")
    public String home(Model model){
        model.addAttribute("productos", productoService.findAll());
        return "usuario/home";
    }
    
    @GetMapping("productohome/{id}")
    public String productoHome(@PathVariable Integer id){ //mostramos el producto por el id
        log.info("Id producto enviado como parametro {}", id);
        return "usuario/productohome";
    }
}
