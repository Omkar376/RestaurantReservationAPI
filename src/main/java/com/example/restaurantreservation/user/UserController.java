package com.example.restaurantreservation.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurantreservation.reservation.Reservation;
import com.example.restaurantreservation.reservation.ReservationService;
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//Get all Users
	@GetMapping("/users")
	public List<User> getUsers() {

		return userService.getUsers();
				
	}
	
	//Create new User
	@PostMapping("/users")
	public String createUser(@RequestBody User newUser) {
		
		userService.save(newUser);	
		return "User created";
	}
}
