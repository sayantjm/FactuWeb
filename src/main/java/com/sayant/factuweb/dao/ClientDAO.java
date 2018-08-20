package com.sayant.factuweb.dao;

import com.sayant.factuweb.entity.Client;

import java.util.List;

public interface ClientDAO {
    public Client findById(Long id);

    public Client save(Client client);

    public boolean remove(Long clientId);

    public List<Client> findALL();
}
