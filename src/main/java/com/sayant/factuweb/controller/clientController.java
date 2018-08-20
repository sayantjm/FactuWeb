package com.sayant.factuweb.controller;

import com.sayant.factuweb.entity.Client;
import com.sayant.factuweb.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/client", produces = "application/json")
public class clientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value="/listAll", method = RequestMethod.GET)
    public List<Client> findAll() {
         return clientService.findAll();
     }

    @RequestMapping(value="/save", method = RequestMethod.POST, consumes = "application/json")
    public Client save(@RequestBody Client client) {
        return clientService.save(client);
    }

    @RequestMapping(value="/create", method = RequestMethod.POST, consumes = "application/json")
    public Client create(@RequestBody Client client) {
        return clientService.save(client);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        boolean wasDeleted = clientService.delete(id);

        HttpStatus responseStatus = wasDeleted ? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(responseStatus);
    }
}
