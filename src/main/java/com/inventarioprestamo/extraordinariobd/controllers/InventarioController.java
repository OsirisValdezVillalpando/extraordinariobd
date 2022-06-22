package com.inventarioprestamo.extraordinariobd.controllers;

import com.inventarioprestamo.extraordinariobd.dao.InventarioDao;
import com.inventarioprestamo.extraordinariobd.models.Inventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class InventarioController {

    @Autowired
    private InventarioDao inventarioDao;

    //crea la api eliminar que elimina un invetario
    @RequestMapping(value = "eliminar/{inv_id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable int inv_id){
        inventarioDao.eliminar(inv_id);
    }

    //crea la api inventarios que devuelve todos los inventrios
    @RequestMapping(value = "inventarios", method = RequestMethod.GET)
    public List<Inventario> getInventarios(){
       return inventarioDao.getInventarios();
    }

    //crea la api inventario que recibe un id y devuelve un inventario
    @RequestMapping(value = "inventario/{inv_id}", method = RequestMethod.GET)
    public Inventario getInventario(@PathVariable int inv_id){
        return inventarioDao.getInventario(inv_id);
    }
}
