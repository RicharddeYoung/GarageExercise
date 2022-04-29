package com.qa.vehicles;

public class Car extends Vehicle {

	// ATTRIBUTES
	private int doorCount;
	private boolean hasSunroof;
	private int year;
	
	// CONSTRUCTOR
	public Car(String type, String manufacturer, String model, String colourInt, String colourExt, int wheelCount,
			double price, int customerID, int vehicleID, int doorCount, boolean hasSunroof, int year) {
		super(type, manufacturer, model, colourInt, colourExt, wheelCount, price, customerID, vehicleID);
		this.doorCount = doorCount;
		this.hasSunroof = hasSunroof;
		this.year = year;
	}

	// GETTERS AND SETTERS
	public int getDoorCount() {
		return doorCount;
	}

	public void setDoorCount(int doorCount) {
		this.doorCount = doorCount;
	}

	public boolean isHasSunroof() {
		return hasSunroof;
	}

	public void setHasSunroof(boolean hasSunroof) {
		this.hasSunroof = hasSunroof;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
