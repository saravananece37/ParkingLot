package com.processor;

import java.time.LocalDateTime;

import com.model.Vehicle;

public class RequestProcessor {
	

	static RequestProcessor requestProcessor;
	int exitSlotID;
	

	
	public static RequestProcessor getInstance()
	{
		if(requestProcessor==null)
			requestProcessor=new RequestProcessor();
			return requestProcessor;
	}
	
	public int addNewVehicle(ParkingMode mode, Vehicle vehicle) throws Exception {
		//0 1
		System.out.println("Current slot size "+mode.currentlyOccupiedSlotSize);
		if (mode.currentlyOccupiedSlotSize != mode.maxSize-1) {
			mode.currentlyOccupiedSlotSize++;
			mode.slots.put(mode.currentlyOccupiedSlotSize, vehicle);// 1 vehi  2 vehi
			return mode.currentlyOccupiedSlotSize;
		} else
			throw new Exception("No slots avaialble at the moment");
	}

	public int getTotalAmountForDay(ParkingMode mode) {
		return mode.totalAmountCollected;
	}

	public int manualExit(ParkingMode mode, int slotId) {
		Vehicle vehicle = mode.slots.get(slotId);
		vehicle.setExitTime(LocalDateTime.now());
		this.exitSlotID=slotId;
		exitProcess(mode);
		return mode.getTotalAmount(vehicle);
	}
	
	public void exitProcess(ParkingMode mode)
	{
		mode.currentlyOccupiedSlotSize--;
		mode.slots.remove(this.exitSlotID);
	}

}
