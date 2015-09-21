package com.carApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CarReader {
	
	public static void readFile() {
		
		File file = new File("newCarFile.txt");
		BufferedReader br = null;

		try{
			
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
	
			String line;
			
			while((line = br.readLine()) != null) {
					System.out.println(line);
			}
			
		
		} catch (FileNotFoundException e) {
			System.out.println("File '" + file.toString() + "' Not Found");
		} catch (IOException e) {
			System.out.println("Cannot Read File: '" + file.toString() + "'");
		}
		
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("Cannot Close File: '" + file.toString() + "'");
		}

	}
}
