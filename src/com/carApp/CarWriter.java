package com.carApp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CarWriter {
	
	
	public static void writeFile() {
		
		///// Creating Car Objects ///////
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();
		Car car5 = new Car();
		
		car1.setInfo("ESV", "Cadilac", "SUV", 2012, 25000);
		car2.setInfo("F150", "Ford", "Truck", 2013, 22000);
		car3.setInfo("Yukon", "GMC", "SUV", 2012, 21000);
		car4.setInfo("S550", "Benz", "Sedan", 2014, 30000);
		car5.setInfo("G37", "Infinity", "Sedan", 2015, 35000);
	
		//// Creating List of Car Objects /////
		
		ArrayList<Car> carList = new ArrayList<>();
		
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(car4);
		carList.add(car5);
	
		////// Creating and Writing NewCarFile /////
		
		File carFile = new File("newCarFile.txt");
		
		try(BufferedWriter br = new BufferedWriter(new FileWriter(carFile))) {	
			
			for (Car info : carList) {
				br.write(info.toString());
			}
		} catch (IOException e) {
			System.out.println("Cannot Write File: " + carFile.toString() );		}
		
	}
}