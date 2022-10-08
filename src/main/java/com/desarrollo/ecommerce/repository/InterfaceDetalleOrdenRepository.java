
package com.desarrollo.ecommerce.repository;

import com.desarrollo.ecommerce.model.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rober
 */

@Repository
public interface InterfaceDetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer>{
    
}
