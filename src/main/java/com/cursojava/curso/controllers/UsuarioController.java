package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario")
    public Usuario getUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristian");
        usuario.setApellido("Gutierrez");
        usuario.setEmail("cristian@gmail.com");
        usuario.setTelefono("3232332323");
        return usuario;
    }
    @RequestMapping(value = "usuario")
    public Usuario editar() {

    }
}
