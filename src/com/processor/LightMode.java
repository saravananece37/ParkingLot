package com.processor;

import java.util.HashMap;

import com.model.Vehicle;

public class LightMode extends ParkingMode {

	public LightMode(int slotSize) {
		this.slots = new HashMap<>();
		this.maxSize = slotSize;
	}

	@Override
	public int getTotalAmount(Vehicle vehicle) {
		int totalHours = vehicle.getExitTime().getHour() - vehicle.getStartingTime().getHour();
		this.totalAmountCollected += totalHours * 10;
		return totalHours * 10;
	}

}
