package com.example.restaurantreservation.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepository restaurantRespository;
	
	//Get All Restaurants
	public List<Restaurant> getAllRestaurants() {
		return restaurantRespository.findAll();
				
	}
	
	//Create a new Restaurant
	public void save(Restaurant restaurant) {
		restaurantRespository.save(restaurant);
	}
	
	//Get Restaurant by ID
	public Restaurant get(Integer id) {
		return restaurantRespository.findById(id).get();
	}
	
}
