package borth.crud.demo.service;

import borth.crud.demo.entity.Usuario;
import borth.crud.demo.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product service implement.
 */
@Service
public class UsuarioServiceImp implements UsuarioService {
    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public Iterable<Usuario> listAllUsuarios() {
        return usuariosRepository.findAll();
    }

    @Override
    public Usuario getUsuarioById(Integer id) {
        return usuariosRepository.findById(id).get();
    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuariosRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(Integer id) {
        usuariosRepository.deleteById(id);
    }

}