package com.inventarioprestamo.extraordinariobd.dao;

import com.inventarioprestamo.extraordinariobd.models.Inventario;

import java.util.List;

//interfaz de inventario que implementa los métodos
public interface InventarioDao {
    void eliminar(int inv_id);
    List<Inventario> getInventarios();

    Inventario getInventario(int inv_id);
}
