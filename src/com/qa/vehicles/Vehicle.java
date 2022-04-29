package com.qa.vehicles;

public abstract class Vehicle {
	
	// ATTRIBUTES
	private String type;
	private String manufacturer;
	private String model;
	private String colourInt;
	private String colourExt;
	private int wheelCount;
	private double price;
	private int customerID;
	private int vehicleID;
	
	// CONSTRUCTOR
	public Vehicle(String type, String manufacturer, String model, String colourInt, String colourExt, int wheelCount,
			double price, int customerID, int vehicleID) {
		super();
		this.type = type;
		this.manufacturer = manufacturer;
		this.model = model;
		this.colourInt = colourInt;
		this.colourExt = colourExt;
		this.wheelCount = wheelCount;
		this.price = price;
		this.customerID = customerID;
		this.vehicleID = vehicleID;
	}

	// OVERLOAD
	public Vehicle() {
		super();
	}

	// GETTERS AND SETTERS
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColourInt() {
		return colourInt;
	}

	public void setColourInt(String colourInt) {
		this.colourInt = colourInt;
	}

	public String getColourExt() {
		return colourExt;
	}

	public void setColourExt(String colourExt) {
		this.colourExt = colourExt;
	}

	public int getWheelCount() {
		return wheelCount;
	}

	public void setWheelCount(int wheelCount) {
		this.wheelCount = wheelCount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

}
