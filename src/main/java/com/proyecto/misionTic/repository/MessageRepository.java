/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.misionTic.repository;


import com.proyecto.misionTic.entities.Message;
import com.proyecto.misionTic.repository.CrudRepository.MessageCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class MessageRepository {
    
    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> getAll(){
        return (List<Message>) messageCrudRepository.findAll();
    }

    public Message save(Message message){
        return messageCrudRepository.save(message);
    }
    public Optional<Message> getMessage(int id){
        return messageCrudRepository.findById(id);
    }
    
    
}

