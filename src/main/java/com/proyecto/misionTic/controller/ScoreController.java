/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.misionTic.controller;

/**
 *
 * @author Michelle
 */
import com.proyecto.misionTic.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class ScoreController {

    @Autowired
    private ScoreService scoreService;

  
 
}
