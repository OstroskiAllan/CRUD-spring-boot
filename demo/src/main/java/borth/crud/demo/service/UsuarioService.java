package borth.crud.demo.service;

import  borth.crud.demo.entity.Usuario;

public interface UsuarioService {

    Iterable<Usuario> listAllUsuarios();

    Usuario getUsuarioById(Integer id);

    Usuario saveUsuario(Usuario usuario);

    void deleteUsuario(Integer id);

}