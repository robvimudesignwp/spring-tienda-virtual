
package com.desarrollo.ecommerce.repository;

import com.desarrollo.ecommerce.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rober
 */

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
