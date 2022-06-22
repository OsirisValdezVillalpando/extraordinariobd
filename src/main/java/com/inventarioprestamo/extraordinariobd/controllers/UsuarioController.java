package com.inventarioprestamo.extraordinariobd.controllers;

import com.inventarioprestamo.extraordinariobd.dao.UsuarioDao;
import com.inventarioprestamo.extraordinariobd.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    //crea la api usuarios que devuelve todos los usurios
    @RequestMapping(value = "usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuario(){return usuarioDao.getUsuarios();}
}
