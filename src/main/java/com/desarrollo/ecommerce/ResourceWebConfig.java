
package com.desarrollo.ecommerce;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author rober
 */

@Configuration
public class ResourceWebConfig implements WebMvcConfigurer {
    final Environment environment;
    
    public ResourceWebConfig(Environment environment){
        this.environment = environment;
    }
    
    
    public void addResouceHandlers(final ResourceHandlerRegistry registry){
        String location = environment.getProperty("file:/images/");
        registry.addResourceHandler("/images/**").addResourceLocations(location);
        /**
         * mostramos las imagenes de los productos en la vista home
         */
    }
}
