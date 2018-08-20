package com.sayant.factuweb.dao.impl;

import com.sayant.factuweb.dao.ClientDAO;
import com.sayant.factuweb.entity.Client;
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
public class ClientDAOImpl implements ClientDAO{

    @Autowired
    EntityManager em;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Client findById(Long id) {
        return em.find(Client.class, id);
    }

    @Override
    public Client save(Client client) {
        if (client.getId() == null) {
            em.persist(client);
        } else {
            em.merge(client);
        }
        return client;
    }

    @Override
    public boolean remove(Long clientId) {
        em.remove(findById(clientId));
        if (findById(clientId) == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Client> findALL() {
        Query query = em.createQuery("select c from Client c");
        return query.getResultList();
    }
}
