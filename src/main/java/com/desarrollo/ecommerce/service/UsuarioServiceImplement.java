
package com.desarrollo.ecommerce.service;

import com.desarrollo.ecommerce.model.Usuario;
import com.desarrollo.ecommerce.repository.UsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rober
 */

@Service
public class UsuarioServiceImplement implements InterfaceUsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public Optional<Usuario> findById(Integer id) {
        return usuarioRepository.findById(id);
    }
    
}
