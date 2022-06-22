package com.inventarioprestamo.extraordinariobd.dao;

import com.inventarioprestamo.extraordinariobd.models.Prestamo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class PrestamoDaoImp implements PrestamoDao{

    @PersistenceContext
    EntityManager entityManager;

    //método que añade un prestamo a la bd
    @Override
    public void setPrestamo(Prestamo prestamo) {
        entityManager.merge(prestamo);
    }

    //método que edita un prestamo
    @Override
    public void devolucionPrestamo(Prestamo prestamo) {
        int pre_id = prestamo.getPre_id();
        Prestamo antiguo = entityManager.find(Prestamo.class, pre_id);

        antiguo.setPre_fecha_entrega(prestamo.getPre_fecha_entrega());
        antiguo.setPre_estado(prestamo.getPre_estado());
        antiguo.setPre_observaciones(prestamo.getPre_observaciones());
    }

    //método que obtiene un prestamo por su id desde la bd
    @Override
    public Prestamo getPrestamo(int pre_id) {
        Prestamo prestamo = entityManager.find(Prestamo.class, pre_id);
        return prestamo;
    }

    //método que obtiene todos los prestamos de la bd
    @Override
    public List<Prestamo> getPrestamos() {
        String query = "FROM Prestamo";
        return entityManager.createQuery(query).getResultList();
    }
}
