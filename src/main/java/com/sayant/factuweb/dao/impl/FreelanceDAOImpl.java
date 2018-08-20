package com.sayant.factuweb.dao.impl;

import com.sayant.factuweb.dao.FreelanceDAO;
import com.sayant.factuweb.entity.Freelance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class FreelanceDAOImpl implements FreelanceDAO{

    @Autowired
    EntityManager em;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Freelance findById(Long id) {
        return em.find(Freelance.class, id);
    }

    @Override
    public Freelance save(Freelance Freelance) {
        if (Freelance.getId() == null) {
            em.persist(Freelance);
        } else {
            em.merge(Freelance);
        }
        return Freelance;
    }

    @Override
    public boolean remove(Long FreelanceId) {
        em.remove(findById(FreelanceId));
        if (findById(FreelanceId) == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Freelance> findALL() {
        Query query = em.createQuery("select f from Freelance f");
        return query.getResultList();
    }
}
