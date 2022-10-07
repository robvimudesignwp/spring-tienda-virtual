
package com.desarrollo.ecommerce.service;

import com.desarrollo.ecommerce.model.Usuario;
import java.util.Optional;

/**
 *
 * @author rober
 */
public interface InterfaceUsuarioService {
    Optional<Usuario> findById(Integer id);
}
