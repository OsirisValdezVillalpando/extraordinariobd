package com.inventarioprestamo.extraordinariobd.controllers;

import com.inventarioprestamo.extraordinariobd.dao.PrestamoDao;
import com.inventarioprestamo.extraordinariobd.models.Prestamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PrestamoController {
    @Autowired
    private PrestamoDao prestamoDao;

    //crea la api prestamo/insert que añade un nuevo prestamo a la bd
    @RequestMapping(value = "prestamo/insert", method = RequestMethod.POST)
    public void setPrestamo(@RequestBody Prestamo prestamo) {
        prestamoDao.setPrestamo(prestamo);
    }

    //crea la api prestamo/edit que edita un prestamo
    @RequestMapping(value = "prestamo/edit", method = RequestMethod.POST)
    public void devolucionPrestamo(@RequestBody Prestamo prestamo){
        prestamoDao.devolucionPrestamo(prestamo);
    }

    //crea la api prestamo que recibe un id y devuelve el prestamo solicitado
    @RequestMapping(value = "prestamo/{pre_id}", method = RequestMethod.GET)
    public Prestamo getPrestamo(@PathVariable int pre_id){
        return prestamoDao.getPrestamo(pre_id);
    }

    //crea la api prestamos que devuelve todos los prestamos
    @RequestMapping(value = "prestamos", method = RequestMethod.GET)
    public List<Prestamo> getPrestamos(){
        return prestamoDao.getPrestamos();
    }
}

