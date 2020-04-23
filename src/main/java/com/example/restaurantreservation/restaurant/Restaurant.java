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
	private Integer two_table_count;
	private Integer four_table_count;
	private Integer six_table_count;
	private Integer twelve_table_count;
	
	public Restaurant() {
		
	}
	
	public Restaurant(Integer id, String name, String address, String contact_number, String email, int two_table_count,
			int four_table_count, int six_table_count, int twelve_table_count) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact_number = contact_number;
		this.email = email;
		this.two_table_count = two_table_count;
		this.four_table_count = four_table_count;
		this.six_table_count = six_table_count;
		this.twelve_table_count = twelve_table_count;
	}
	
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
	public int getTwo_table_count() {
		return two_table_count;
	}
	public void setTwo_table_count(int two_table_count) {
		this.two_table_count = two_table_count;
	}
	public int getFour_table_count() {
		return four_table_count;
	}
	public void setFour_table_count(int four_table_count) {
		this.four_table_count = four_table_count;
	}
	public int getSix_table_count() {
		return six_table_count;
	}
	public void setSix_table_count(int six_table_count) {
		this.six_table_count = six_table_count;
	}
	public int getTwelve_table_count() {
		return twelve_table_count;
	}
	public void setTwelve_table_count(int twelve_table_count) {
		this.twelve_table_count = twelve_table_count;
	}
	
	
}
