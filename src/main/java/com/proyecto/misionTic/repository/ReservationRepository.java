package com.proyecto.misionTic.repository;

import com.proyecto.misionTic.entities.Client;
import com.proyecto.misionTic.entities.DTOs.CountClient;
import com.proyecto.misionTic.entities.Reservation;
import com.proyecto.misionTic.repository.CrudRepository.ReservationCrudRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepository {
    
    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> getAll(){
        return (List<Reservation>) reservationCrudRepository.findAll();
    }

    public Reservation save(Reservation reservation){
        return reservationCrudRepository.save(reservation);
    }
    public Optional<Reservation> getReservation(int id){
        return reservationCrudRepository.findById(id);
    }
    
    public void delete(Reservation reservation) {
        reservationCrudRepository.delete(reservation);
    }
    
    //Reto5
    public List<CountClient> getTopClients(){
        
        List<CountClient> respuesta = new ArrayList<>();
        
        List<Object[]> reporte = reservationCrudRepository.countTotalReservationByClient();
        
        for(int i = 0; i<reporte.size(); i++) {
            respuesta.add(new CountClient((Long)reporte.get(i)[1], (Client)reporte.get(i)[0]));
        }
        return respuesta;
    } 
    
    public List<Reservation> getReservationPeriod(Date a, Date b) {
        
        return reservationCrudRepository.findAllByStartDateAfterAndDevolutionDateBefore(a, b);
    }
    
    public List<Reservation> getReservationByStatus(String status) {
        return reservationCrudRepository.findAllByStatus(status);
    }
    
}
