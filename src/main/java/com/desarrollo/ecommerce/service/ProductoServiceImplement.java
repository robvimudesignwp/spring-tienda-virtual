
package com.desarrollo.ecommerce.service;

import com.desarrollo.ecommerce.model.Producto;
import com.desarrollo.ecommerce.repository.ProductoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rober
 */

@Service
public class ProductoServiceImplement implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    
    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto); 
    }

    @Override
    public Optional<Producto> get(Integer id) {
        return productoRepository.findById(id); 
    }

    @Override
    public void update(Producto producto) {
        productoRepository.save(producto); 
    }

    @Override
    public void delete(Integer id) {
        productoRepository.deleteById(id);
    }
    
}
