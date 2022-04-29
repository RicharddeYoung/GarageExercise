package com.qa.main;

import com.qa.garage.Garage;

import com.qa.vehicles.Motorbike;

import com.qa.vehicles.Car;

import com.qa.vehicles.Van;


public class Runner {

	public static void main(String[] args) {
		
		// VEHICLE DETAILS
		Motorbike motorOne = new Motorbike("Motorbike", "Harley Davidson", "Roadster-Rs", "N/A", "Black & Red", 2, 599.99, 001, 123, 110, false);
		Motorbike motorTwo = new Motorbike("Motorbike", "BMW", "S1000RR", "N/A", "Silver & Black", 2, 654.50, 002, 234, 188, true);
		Car carOne = new Car("Car", "Toyota", "Corolla", "Sky Blue", "Racing Grey", 4, 234.65, 001, 345, 5, false, 2004);
		Car carTwo = new Car("Car", "Mazda", "Demio", "Crimson", "Silver", 4, 399, 003, 456, 5, true, 2006);
		Van vanOne = new Van("Van", "Ford", "Transit 150", "Swamp Green", "White", 4, 425, 004, 567, 277.7, true, false);

		// GARAGE ENTRY
		Garage garage = new Garage();
		garage.addVehicle(motorOne);
		garage.addVehicle(motorTwo);
		garage.addVehicle(carOne);
		garage.addVehicle(carTwo);
		garage.addVehicle(vanOne);
		
		// GARAGE TESTS
		garage.printInfo(carOne);
		System.out.println(" ");
		
//		garage.checkPrices();
		
//		garage.removeVehiclesByID(123);
		
	}

}
