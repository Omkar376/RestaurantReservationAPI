package com.example.restaurantreservation.reservation;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {

	private Integer id;
	private Integer restaurant_id;
	private Integer user_id;
	private Date start_datetime;
	private Date end_datetime;
	private String table_type;
	

	
	public Reservation() {
		
	}
	
	//Constructor
	public Reservation(Integer id, Integer restaurant_id, Integer user_id, Date start_datetime, Date end_datetime,
			String table_type) {
		super();
		this.id = id;
		this.restaurant_id = restaurant_id;
		this.user_id = user_id;
		this.start_datetime = start_datetime;
		this.end_datetime = end_datetime;
		this.table_type = table_type;
	}
	

	//Getters and Setters for fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRestaurant_id() {
		return restaurant_id;
	}
	public void setRestaurant_id(Integer restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Date getStart_datetime() {
		return start_datetime;
	}
	public void setStart_datetime(Date start_datetime) {
		this.start_datetime = start_datetime;
	}
	public Date getEnd_datetime() {
		return end_datetime;
	}
	public void setEnd_datetime(Date end_datetime) {
		this.end_datetime = end_datetime;
	}
	public String getTable_type() {
		return table_type;
	}
	public void setTable_type(String table_type) {
		this.table_type = table_type;
	}
	
}