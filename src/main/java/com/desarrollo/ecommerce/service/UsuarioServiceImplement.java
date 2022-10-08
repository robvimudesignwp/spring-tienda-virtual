
package com.desarrollo.ecommerce.service;

import com.desarrollo.ecommerce.model.Usuario;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.desarrollo.ecommerce.repository.InterfaceUsuarioRepository;

/**
 *
 * @author rober
 */

@Service
public class UsuarioServiceImplement implements InterfaceUsuarioService{
    
    @Autowired
    private InterfaceUsuarioRepository usuarioRepository;
    
    @Override
    public Optional<Usuario> findById(Integer id) {
        return usuarioRepository.findById(id);
    }
    
}
