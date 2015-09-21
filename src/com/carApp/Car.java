package com.carApp;


public class Car {

	private String name;
	private String make;
	private String model;
	private int year;
	private int price;

	public void setInfo(String name, String make, String model, int year, int price) {
		this.name = name;
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

		
	public String toString(){
		return (name + ", " + make + ", " + model + ", " + year + ", " + price + "\n");
		
	}
	
}
