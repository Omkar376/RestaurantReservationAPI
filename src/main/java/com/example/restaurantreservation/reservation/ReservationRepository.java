package com.example.restaurantreservation.reservation;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.restaurantreservation.restaurant.Restaurant;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

	@Query("select r from Reservation r where r.restaurant_id like ?1 and user_id like ?2")
    List<Reservation> getReservations(Integer id, Integer user_id);
	
	//Query to get if any reservation is confirmed in time period
	@Query("select r from Reservation r where r.restaurant_id like ?1 and r.table_type like ?2 and ( ?3 between r.start_datetime and r.end_datetime\r\n" + 
			"    OR\r\n" + 
			"    ?3 between r.start_datetime and r.end_datetime\r\n" + 
			"    OR\r\n" + 
			"    r.start_datetime between ?3 and ?4)")
    List<Reservation> getConfirmedReservations(Integer id, String table_type, Date start_datetime , Date  end_datetime);
}
