
package com.desarrollo.ecommerce.service;

import com.desarrollo.ecommerce.model.Producto;
import java.util.Optional;

/**
 *
 * @author rober
 */
public interface ProductoService {
    //Interfaz para definir todos los metodos CRUD
    public Producto save(Producto producto);
    public Optional<Producto> get(Integer id);
    public void update(Producto producto);
    public void delete(Integer id);
    
}
