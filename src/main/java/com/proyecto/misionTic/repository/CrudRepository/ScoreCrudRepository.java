package com.proyecto.misionTic.repository.CrudRepository;


import com.proyecto.misionTic.entities.Score;
import org.springframework.data.repository.CrudRepository;

public interface ScoreCrudRepository extends CrudRepository<Score, Integer> {
    
}