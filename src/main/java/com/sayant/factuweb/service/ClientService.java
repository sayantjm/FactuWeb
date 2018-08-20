package com.sayant.factuweb.service;

import com.sayant.factuweb.entity.Client;

import java.util.List;

public interface ClientService {
    public List<Client> findAll();

    public Client save(Client client);

    boolean delete(Long idClient);
}
