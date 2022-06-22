package com.inventarioprestamo.extraordinariobd.controllers;

import com.inventarioprestamo.extraordinariobd.dao.SolicitanteDao;
import com.inventarioprestamo.extraordinariobd.models.Solicitante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SolicitanteController {

    @Autowired
    private SolicitanteDao solicitanteDao;

    //crea la api solicitantes devuelve todos los solicitantes
    @RequestMapping(value = "solicitantes", method = RequestMethod.GET)
    public List<Solicitante> getSolicitantes(){
        return solicitanteDao.getSolicitantes();
    }
}
