package com.inventarioprestamo.extraordinariobd.dao;

import com.inventarioprestamo.extraordinariobd.models.Prestamo;

import java.util.List;

//interfaz de prestamo que implementa los métodos
public interface PrestamoDao {

    void setPrestamo(Prestamo prestamo);

    void devolucionPrestamo(Prestamo prestamo);

    Prestamo getPrestamo(int pre_id);

    List<Prestamo> getPrestamos();
}
