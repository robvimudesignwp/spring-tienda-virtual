
package com.desarrollo.ecommerce.service;

import com.desarrollo.ecommerce.model.DetalleOrden;
import com.desarrollo.ecommerce.repository.InterfaceDetalleOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rober
 */

@Service
public class DetalleOrdenServiceImplement implements InterfaceDetalleOrdenService {

    @Autowired
    private InterfaceDetalleOrdenRepository detalleOrdenRepository;
    
    @Override
    public DetalleOrden save(DetalleOrden detalleOrden) {
        return detalleOrdenRepository.save(detalleOrden);
    }
    
}
