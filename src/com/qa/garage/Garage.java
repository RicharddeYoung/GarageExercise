package com.qa.garage;

import java.util.ArrayList;

import com.qa.vehicles.Motorbike;
import com.qa.vehicles.Vehicle;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
			
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	
	public void removeVehicle(Vehicle v) {
		if (this.vehicles.remove(v)) {
			System.out.println("\n\n\tVehicle returned to owner.");
		} else {
			System.out.println("\n\n\tVehicle not found. Please make another selection.");
		}
	}
	
	public void removeVehiclesByType(String type) {
		ArrayList<Vehicle> inGarage = new ArrayList<Vehicle>();
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getType() == type) {
				inGarage.add(vehicle);
			}
		}
		for (Vehicle destroy: inGarage) {
			vehicles.remove(destroy);
		}
	}
	
	public void removeVehiclesByID(int vehicleID) {
		Vehicle inGarage = null;
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getVehicleID() == vehicleID) {
				inGarage = vehicle;
			}
		}
		removeVehicle(inGarage);
	}

	public double fixVehicle(Vehicle v) {
			if (v.getType() == "Motorbike") {
				double cost = v.getPrice() + 75;
				return cost;
			} else if (v.getType() == "Car") {
				double cost = v.getPrice() + 125;
				return cost;
			} else {
				double cost = v.getPrice() + 200;
				return cost;
			}
	}
	
	public void checkPrices() {
		for (Vehicle v : vehicles) {
			System.out.println(fixVehicle(v));
			}
		}
	
	public void printInfo(Vehicle v) {
		System.out.println("Bill for Customer ID: " + v.getCustomerID() + ".");
		System.out.println("Vehicle: " + v.getManufacturer() + " " + v.getModel() + ". Colour: " + v.getColourExt());
		System.out.println("Total repair cost (including labour): £" + fixVehicle(v));
	}
	
	public void clearVehicles(Vehicle vehicle) {
		this.vehicles.clear();
	}
}
