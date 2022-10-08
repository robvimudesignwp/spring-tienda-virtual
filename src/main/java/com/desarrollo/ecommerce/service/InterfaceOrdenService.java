
package com.desarrollo.ecommerce.service;

import com.desarrollo.ecommerce.model.Orden;

/**
 *
 * @author rober
 */


public interface InterfaceOrdenService  {
    
    
    Orden save (Orden orden); //Vamos a recibir un objeto de Orden para que persista en la BD
    
}
