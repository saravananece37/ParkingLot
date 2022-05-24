package com.model;

import java.time.LocalDateTime;

public class Vehicle {

	private int vehicleId;
	
	private String vehicleName;
	
	private User ownerOfVehicle;
	
	private LocalDateTime startingTime;
	
	private LocalDateTime exitTime;

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public User getOwnerOfVehicle() {
		return ownerOfVehicle;
	}

	public void setOwnerOfVehicle(User ownerOfVehicle) {
		this.ownerOfVehicle = ownerOfVehicle;
	}

	public LocalDateTime getStartingTime() {
		return startingTime;
	}

	public void setStartingTime(LocalDateTime startingTime) {
		this.startingTime = startingTime;
	}

	public LocalDateTime getExitTime() {
		return exitTime;
	}

	public void setExitTime(LocalDateTime exitTime) {
		this.exitTime = exitTime;
	}
	
	
	
}
