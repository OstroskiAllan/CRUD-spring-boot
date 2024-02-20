package borth.crud.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import borth.crud.demo.entity.Usuario;
import borth.crud.demo.repository.UsuariosRepository;

@RestController
@RequestMapping("/usuario") // Define o prefixo para todas as rotas definidas neste controller
public class UsuarioController {
    
    @Autowired
    private UsuariosRepository usuariosRepository;
    
    @PostMapping("/save") // Criar um novo usuário
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario save(@RequestBody Usuario usuario) {
        return usuariosRepository.save(usuario);
    }
    
    @GetMapping("/{id}") // Buscar por id
    public Usuario getUsuarioById(@PathVariable Integer id) {
        return usuariosRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Usuario não encontrado"));

    }

    @PutMapping("/update/{id}") // Alterando um usuario
    public ResponseEntity update(@PathVariable Integer id, @RequestBody Usuario usuario) {
        return usuariosRepository
                .findById(id)
                .map(usuarioExistente -> {
                    usuario.setId(usuarioExistente.getId());
                    usuariosRepository.save(usuario);
                    return ResponseEntity.noContent().build();
                }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}") // Deletar usuario por id
    public ResponseEntity<Void> deleteUsuario(@PathVariable Integer id) {
        usuariosRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @GetMapping("/all") // Trazer todos os usuarios
    public List<Usuario> getAllUsuario() {
        return usuariosRepository.findAll();
    }

}
