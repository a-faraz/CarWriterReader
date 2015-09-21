package com.carApp;

public class App {

	public static void main(String[] args) {

		CarWriter.writeFile();
		CarReader.readFile();
		
		System.out.println();
		System.out.println("App Finished Running!");
	}

}