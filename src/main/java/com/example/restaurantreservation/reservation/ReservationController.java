package com.example.restaurantreservation.reservation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping("/reservations")
	public List<Reservation> getReservations() {
		return reservationService.getAllReservations();
				
	}
	
	@PostMapping("/reservation")
	public String createReservation(@RequestBody Reservation newReservation) {
		
		boolean reservation_status = reservationService.getReservationStatus(newReservation);
		if(reservation_status) {			
			reservationService.save(newReservation);			
			return "Reservation Confirmed";
		}else {
			return "Reservation Not Confirmed";
		}		
	}
}