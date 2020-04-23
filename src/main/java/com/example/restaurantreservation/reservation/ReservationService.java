package com.example.restaurantreservation.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
	
	@Autowired
	private ReservationRepository reservationRespository;
	
	public List<Reservation> getAllReservations() {
		return reservationRespository.findAll();			
	}
	
	public void save(Reservation reservation) {
		reservationRespository.save(reservation);
	}
	
	public Reservation get(Integer id) {
		return reservationRespository.findById(id).get();
	}
	
	public boolean getReservationStatus(Reservation reservation) {
		reservationRespository.findByRestaurant_idAndUser_id(1252, 1513);
		return true;
	}
	
}