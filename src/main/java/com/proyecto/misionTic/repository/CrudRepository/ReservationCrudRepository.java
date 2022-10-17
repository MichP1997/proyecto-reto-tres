package com.proyecto.misionTic.repository.CrudRepository;


import com.proyecto.misionTic.entities.Reservation;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
     @Query("SELECT s.box, COUNT (s.box) FROM Reservation AS s GROUP BY s.box ORDER BY COUNT(s.box) DESC")
    public List<Object[]> countTotalReservationByBox();
    
    @Query("SELECT c.client, COUNT (c.client) FROM Reservation AS c GROUP BY c.client ORDER BY COUNT(c.client) DESC")
    public List<Object[]> countTotalReservationByClient();
    
    //SELECT * from Reservation where tartDate AFTER fechaInicio AND devolutionDate Before FEchaFin ; 
    public List<Reservation> findAllByStartDateAfterAndDevolutionDateBefore (Date dateOne, Date dateTwo);
    
    //SELECT * FROM Reservation where status 'cancelled' 
    public List<Reservation> findAllByStatus(String staus);
}
