package com.sayant.factuweb.service.impl;

import com.sayant.factuweb.dao.ClientDAO;
import com.sayant.factuweb.entity.Client;
import com.sayant.factuweb.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDAO clientDAO;

    @Override
    public List<Client> findAll() {
        return clientDAO.findALL();
    }

    @Override
    public Client save(Client client) {
        return clientDAO.save(client);
    }

    @Override
    public boolean delete(Long idClient) {
        return clientDAO.remove(idClient);
    }
}
