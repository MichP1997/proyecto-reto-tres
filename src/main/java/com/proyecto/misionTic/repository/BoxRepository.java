
package com.proyecto.misionTic.repository;


import com.proyecto.misionTic.entities.Box;
import com.proyecto.misionTic.repository.CrudRepository.BoxCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class BoxRepository {
    
    @Autowired
    private BoxCrudRepository boxCrudRepository;

    public List<Box> getAll(){
        return (List<Box>) boxCrudRepository.findAll();
    }

    public Box save(Box box){
        return boxCrudRepository.save(box);
    }
    public Optional<Box> getBox(int id){
        return boxCrudRepository.findById(id);
    }
    
    public void delete(Box box){
        boxCrudRepository.delete(box);
    }

    
    
}
