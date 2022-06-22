package com.inventarioprestamo.extraordinariobd.dao;

import com.inventarioprestamo.extraordinariobd.models.Docente;

import java.util.List;

//interfaz de docente que implementa los métodos
public interface DocenteDao {

    List<Docente> getDocentes();
}
