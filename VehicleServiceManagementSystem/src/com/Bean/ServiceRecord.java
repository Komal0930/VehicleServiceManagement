package com.Bean;

import java.sql.Date;

public class ServiceRecord {
	Vehicle vehicle;
	Date date;
	String description;
	double cost;
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void setDate(Date date2) {
		this.date = date2;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public Date getDate() {
		return date;
	}
	public String getDescription() {
		return description;
	}
	public double getCost() {
		return cost;
	}
	
	

}
