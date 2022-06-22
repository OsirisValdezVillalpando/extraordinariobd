package com.inventarioprestamo.extraordinariobd.dao;

import com.inventarioprestamo.extraordinariobd.models.Usuario;

import java.util.List;

//interfaz de usuario que implementa los métodos
public interface UsuarioDao {
    List<Usuario> getUsuarios();
}
