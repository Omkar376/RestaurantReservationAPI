package com.example.restaurantreservation.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	private Integer id;
	private String name;
	private String contact_number;
	private String email;
	
	public User() {
		
	}
	
	//Constructor
	public User(Integer id, String name, String contact_number, String email) {
		super();
		this.id = id;
		this.name = name;
		this.contact_number = contact_number;
		this.email = email;
	}
	
	//Getters and Setters
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
