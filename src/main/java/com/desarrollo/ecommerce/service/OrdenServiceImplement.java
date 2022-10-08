
package com.desarrollo.ecommerce.service;

import com.desarrollo.ecommerce.model.Orden;
import com.desarrollo.ecommerce.repository.InterfaceOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rober
 */

@Service
public class OrdenServiceImplement implements InterfaceOrdenService{
    
    @Autowired
    private InterfaceOrdenRepository ordenRepository;

    @Override
    public Orden save(Orden orden) {
         return ordenRepository.save(orden);
    }
    
}
