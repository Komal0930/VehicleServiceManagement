package com.Bean;

public class Vehicle {
	int id;
	String make;
	String model;
	String vtype;
	int year;
	int mileage;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setType(String type) {
		this.vtype = type;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getId() {
		return id;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public String getType() {
		return vtype;
	}
	public int getYear() {
		return year;
	}
	public int getMileage() {
		return mileage;
	}

	

}
