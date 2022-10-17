package com.proyecto.misionTic.repository.CrudRepository;


import com.proyecto.misionTic.entities.Message;
import org.springframework.data.repository.CrudRepository;


public interface MessageCrudRepository extends CrudRepository<Message, Integer>{
    
}
