package com.inventarioprestamo.extraordinariobd.controllers;

import com.inventarioprestamo.extraordinariobd.dao.DocenteDao;
import com.inventarioprestamo.extraordinariobd.models.Docente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DocenteController {
    @Autowired
    DocenteDao docenteDao;

    //crea la api docentes que devuelve todos los docentes
    @RequestMapping(value = "docentes", method = RequestMethod.GET)
    List<Docente> getDocentes(){
        return docenteDao.getDocentes();
    }
}
