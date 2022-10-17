/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.misionTic.repository;

import com.proyecto.misionTic.repository.CrudRepository.AdminCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class AdminRepository {
    @Autowired
    private AdminCrudRepository adminCrudRepository;
}

