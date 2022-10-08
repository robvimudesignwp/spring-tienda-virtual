
package com.desarrollo.ecommerce.repository;

import com.desarrollo.ecommerce.model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rober
 */

@Repository
public interface InterfaceOrdenRepository extends JpaRepository<Orden, Integer>{
    
}
