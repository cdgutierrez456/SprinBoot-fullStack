package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Cristian");
        usuario.setApellido("Gutierrez");
        usuario.setEmail("cristian@gmail.com");
        usuario.setTelefono("3232332323");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(1234L);
        usuario.setNombre("Luciana");
        usuario.setApellido("Gutierrez");
        usuario.setEmail("cristian@gmail.com");
        usuario.setTelefono("3232332323");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2345L);
        usuario2.setNombre("Antonella");
        usuario2.setApellido("Vela");
        usuario2.setEmail("cristian@gmail.com");
        usuario2.setTelefono("3232332323");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3456L);
        usuario3.setNombre("Ethan");
        usuario3.setApellido("Vela");
        usuario3.setEmail("cristian@gmail.com");
        usuario3.setTelefono("3232332323");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }

    @RequestMapping(value = "usuario2")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristian");
        usuario.setApellido("Gutierrez");
        usuario.setEmail("cristian@gmail.com");
        usuario.setTelefono("3232332323");
        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristian");
        usuario.setApellido("Gutierrez");
        usuario.setEmail("cristian@gmail.com");
        usuario.setTelefono("3232332323");
        return usuario;
    }

    @RequestMapping(value = "usuario4")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristian");
        usuario.setApellido("Gutierrez");
        usuario.setEmail("cristian@gmail.com");
        usuario.setTelefono("3232332323");
        return usuario;
    }

}
