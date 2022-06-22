package com.inventarioprestamo.extraordinariobd.dao;

import com.inventarioprestamo.extraordinariobd.models.Solicitante;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class SolicitanteDaoImp implements SolicitanteDao{

    @PersistenceContext
    EntityManager entityManager;

    //método que obtiene todos los solicitantes de la bd
    @Override
    public List<Solicitante> getSolicitantes() {
        String query = "FROM Solicitante";
        return entityManager.createQuery(query).getResultList();
    }
}
