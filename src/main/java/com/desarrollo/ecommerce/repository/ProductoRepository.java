
package com.desarrollo.ecommerce.repository;

import com.desarrollo.ecommerce.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rober
 */

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
}
