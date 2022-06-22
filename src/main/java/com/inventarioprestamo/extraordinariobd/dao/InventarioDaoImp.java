package com.inventarioprestamo.extraordinariobd.dao;

import com.inventarioprestamo.extraordinariobd.models.Inventario;
import com.inventarioprestamo.extraordinariobd.models.Prestamo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class InventarioDaoImp implements InventarioDao{

    @PersistenceContext
    EntityManager entityManager;

    //método que elimina un inventario de bd
    @Override
    public void eliminar(int inv_id) {
        Inventario inventario = entityManager.find(Inventario.class, inv_id);
        entityManager.remove(inventario);
    }

    //método que obtiene todos los inventarios de la bd
    @Override
    public List<Inventario> getInventarios() {
        String query = "FROM Inventario";

        return entityManager.createQuery(query).getResultList();
    }

    //método que obtiene un inventario por su id de la bd
    @Override
    public Inventario getInventario(int inv_id) {
        Inventario inventario = entityManager.find(Inventario.class, inv_id);
        return inventario;
    }
}
