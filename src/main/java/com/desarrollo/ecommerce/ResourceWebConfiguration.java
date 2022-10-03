
package com.desarrollo.ecommerce;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author rober
 */

@Configuration
public class ResourceWebConfiguration implements WebMvcConfigurer {
    public void addResouceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/images/**").addResourceLocations("file:images/");
        /**
         * mostramos las imagenes de los productos en la vista home
         */
    }
}
