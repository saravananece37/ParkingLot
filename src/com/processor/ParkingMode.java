package com.processor;

import java.util.HashMap;

import com.model.Vehicle;

public abstract class ParkingMode {
	
	HashMap<Integer, Vehicle> slots;
	
	int maxSize;
	
	int totalAmountCollected;
	
	int currentlyOccupiedSlotSize;

	int getTotalAmount(Vehicle vehicle) {
		return 0;
	}	

}
