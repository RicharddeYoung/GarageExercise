package com.qa.vehicles;

public class Van extends Vehicle {

	// ATTRIBUTES
	private double capacity;
	private boolean slidingDoors;
	private boolean roofRack;
		
	// CONSTRUCTOR
	public Van(String type, String manufacturer, String model, String colourInt, String colourExt, int wheelCount,
			double price, int customerID, int vehicleID, double capacity, boolean slidingDoors, boolean roofRack) {
		super(type, manufacturer, model, colourInt, colourExt, wheelCount, price, customerID, vehicleID);
		this.capacity = capacity;
		this.slidingDoors = slidingDoors;
		this.roofRack = roofRack;
	}
	
	//GETTERS AND SETTERS
	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public boolean isSlidingDoors() {
		return slidingDoors;
	}

	public void setSlidingDoors(boolean slidingDoors) {
		this.slidingDoors = slidingDoors;
	}

	public boolean isRoofRack() {
		return roofRack;
	}

	public void setRoofRack(boolean roofRack) {
		this.roofRack = roofRack;
	}
}
