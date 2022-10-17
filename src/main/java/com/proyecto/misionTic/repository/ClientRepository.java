/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.misionTic.repository;

import com.proyecto.misionTic.entities.Client;
import com.proyecto.misionTic.repository.CrudRepository.ClientCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ClientRepository {
    
    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }

    public Client save(Client client){
        return clientCrudRepository.save(client);
    }


    public Optional<Client> getClient(int id){
        return clientCrudRepository.findById(id);
    }
    
    public void delete(Client client){
        clientCrudRepository.delete(client);
    }
    
}

