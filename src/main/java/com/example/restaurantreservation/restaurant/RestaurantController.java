package com.example.restaurantreservation.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurantreservation.user.User;

@RestController
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;
	
	//Get all Restaurants
	@RequestMapping("/restaurants")
	public List<Restaurant> getRestaurants() {
		return restaurantService.getAllRestaurants();
				
	}
	
	//Create a new Restaurant
	@PostMapping("/restaurants")
	public String createRestaurants(@RequestBody Restaurant newRestaurant) {
		 restaurantService.save(newRestaurant);
		 return "Resaturant Created";		
	}
}
