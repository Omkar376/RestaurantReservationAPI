package com.example.restaurantreservation.reservation;

import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restaurantreservation.restaurant.Restaurant;
import com.example.restaurantreservation.restaurant.RestaurantRepository;


@Service
public class ReservationService {
	
	@Autowired
	private ReservationRepository reservationRespository;
	
	@Autowired
	private RestaurantRepository restaurantRespository;
	
	//Get all reservations
	public List<Reservation> getAllReservations() {
		return reservationRespository.findAll();			
	}
	
	//Create a new reservation
	public void save(Reservation reservation) {
		reservationRespository.save(reservation);
	}
	
	//Get reservation by id
	public Reservation get(Integer id) {
		return reservationRespository.findById(id).get();
	}
	
	//Get Status if reservation can be confirmed  
	public boolean getReservationStatus(Reservation reservation) {
		
		//Adding Offset to Start Date Time for cleaning
		DateTime starttime = new DateTime(reservation.getStart_datetime());
		starttime = starttime.minusMinutes(10);
		Date offset_starttime = starttime.toDate();
		
		//Adding Offset to Start Date Time for cleaning
		DateTime endtime = new DateTime(reservation.getEnd_datetime());
		endtime = endtime.plusMinutes(10);
		Date offset_endtime = endtime.toDate();
		
		//Get confirmed reservation in that period
		List<Reservation> confirmedRservations = reservationRespository.getConfirmedReservations(reservation.getRestaurant_id(),
				reservation.getTable_type(), offset_starttime,  offset_endtime);
		
		//Get available table count
		Restaurant restaurant = restaurantRespository.findById(reservation.getRestaurant_id()).get();
		Integer table_count = 0;
		switch (reservation.getTable_type()) {
        case "two_table":
        	table_count = restaurant.getTwo_table(); 
            break;
        case "four_table":
        	table_count = restaurant.getFour_table();
            break;
        case "six_table":
        	table_count = restaurant.getSix_table();
            break;
        case "twelve_table":
        	table_count = restaurant.getTwelve_table();
            break;
		}
		
		//Check if table is available
		if (confirmedRservations.size() >= table_count & table_count != 0) {
			return false;
		}else {
		return true;
		}
	}
	
	
}