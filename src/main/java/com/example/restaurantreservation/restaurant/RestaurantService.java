package com.example.restaurantreservation.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepository restaurantRespository;
	
	public List<Restaurant> getAllRestaurants() {
		return restaurantRespository.findAll();
				
	}
	
	public void save(Restaurant restaurant) {
		restaurantRespository.save(restaurant);
	}
	
	public Restaurant get(Integer id) {
		return restaurantRespository.findById(id).get();
	}
	
}
