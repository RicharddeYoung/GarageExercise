package com.qa.vehicles;

public class Motorbike extends Vehicle {

	// ATTRIBUTES
	private int topSpeed;
	private boolean panniers;
	
	// CONSTRUCTOR
	public Motorbike(String type, String manufacturer, String model, String colourInt, String colourExt, int wheelCount,
			double price, int customerID, int vehicleID, int topSpeed, boolean panniers) {
		super(type, manufacturer, model, colourInt, colourExt, wheelCount, price, customerID, vehicleID);
		this.topSpeed = topSpeed;
		this.panniers = panniers;
	}

	// GETTERS AND SETTERS
	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public boolean isPanniers() {
		return panniers;
	}

	public void setPanniers(boolean panniers) {
		this.panniers = panniers;
	}
	
}
