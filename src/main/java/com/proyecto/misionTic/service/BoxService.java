/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.misionTic.service;

import com.proyecto.misionTic.entities.Box;
import com.proyecto.misionTic.repository.BoxRepository;
import java.util.List;
import java.util.Optional;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoxService {
    
    @Autowired
    private BoxRepository boxRepository;

    public List<Box> getAll(){
        return boxRepository.getAll();
    }

    public Optional<Box> getBox(int id){
        return boxRepository.getBox(id);
    }

    public Box save(Box box){
        if(box.getId()==null){
            return boxRepository.save(box);
        }else {
            Optional<Box> e = boxRepository.getBox(box.getId());
            if (e.isEmpty()){
                return boxRepository.save(box);
            }else {
                return box;
            }
        }
    }
    
    public Box update(Box box){
        if(box.getId()!=null){
            
            Optional<Box> g = boxRepository.getBox(box.getId());
            
            if(!g.isEmpty()){
                
                if(box.getName()!=null){
                    g.get().setName(box.getName());
                }                              
                
                //location
                if(box.getLocation() !=null){
                    g.get().setLocation(box.getLocation());
                }
                
                //capacity
                if(box.getCapacity() !=null){
                    g.get().setCapacity(box.getCapacity());
                } 
                                                              
                if(box.getDescription()!=null){                    
                    g.get().setDescription(box.getDescription());
                }
                
                if(box.getCategory()!=null){                    
                    g.get().setCategory(box.getCategory());
                }
                
                boxRepository.save(g.get());
                return g.get();
                //return boxRepository.save(g.get());
            }else {
                return box;
            }
            
        }else {
            return box;
        }
           
    }
    
    public boolean delete(int id) {
        boolean flag=false;
        Optional<Box> c= boxRepository.getBox(id);
        if(c.isPresent()){
            boxRepository.delete(c.get());
            flag=true;
        }
        return flag;
    }

      

}
