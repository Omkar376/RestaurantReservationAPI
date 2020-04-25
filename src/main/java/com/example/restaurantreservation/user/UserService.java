package com.example.restaurantreservation.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRespository;
	
	//Get all Users
	public List<User> getUsers() {
		return userRespository.findAll();
				
	}
	
	//Create a new user
	public void save(User user) {
		userRespository.save(user);
	}
}
