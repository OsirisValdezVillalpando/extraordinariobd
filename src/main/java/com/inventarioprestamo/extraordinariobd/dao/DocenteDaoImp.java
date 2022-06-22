package com.inventarioprestamo.extraordinariobd.dao;

import com.inventarioprestamo.extraordinariobd.models.Docente;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class DocenteDaoImp implements DocenteDao{


    @PersistenceContext
    EntityManager entityManager;

    //método que obtiene todos los docentes de la bd
    @Override
    public List<Docente> getDocentes() {
        String query = "FROM Docente";
        return entityManager.createQuery(query).getResultList();
    }
}
