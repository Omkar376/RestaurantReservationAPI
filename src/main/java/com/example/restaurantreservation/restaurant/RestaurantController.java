package com.example.restaurantreservation.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;
	
	
	@RequestMapping("/restaurants")
	public List<Restaurant> getRestaurants() {
		return restaurantService.getAllRestaurants();
				
	}
	

}
