package com.example.restaurantreservation.restaurant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurant {

	private Integer id;
	private String name;
	private String address;
	private String contact_number;
	private String email;
	private Integer two_table;
	private Integer four_table;
	private Integer six_table;
	private Integer twelve_table;
	
	//Constructor
	public Restaurant() {
		
	}

	//Constructor
	public Restaurant(Integer id, String name, String address, String contact_number, String email, Integer two_table,
			Integer four_table, Integer six_table, Integer twelve_table) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact_number = contact_number;
		this.email = email;
		this.two_table = two_table;
		this.four_table = four_table;
		this.six_table = six_table;
		this.twelve_table = twelve_table;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Integer getTwo_table() {
		return two_table;
	}

	public void setTwo_table(Integer two_table) {
		this.two_table = two_table;
	}

	public Integer getFour_table() {
		return four_table;
	}

	public void setFour_table(Integer four_table) {
		this.four_table = four_table;
	}

	public Integer getSix_table() {
		return six_table;
	}

	public void setSix_table(Integer six_table) {
		this.six_table = six_table;
	}

	public Integer getTwelve_table() {
		return twelve_table;
	}

	public void setTwelve_table(Integer twelve_table) {
		this.twelve_table = twelve_table;
	}
	
	
	
}
