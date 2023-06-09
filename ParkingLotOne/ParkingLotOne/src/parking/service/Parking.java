package parking.service;

import parking.data.Vehicle;
import parking.utility.ParkingType;

public interface Parking {
	
	
	public void parkVehicle(Vehicle vehicle);

	public void parkLargeVehicle(Vehicle vehicle);
	
	public void parkMediumVehicle(Vehicle vehicle);
	
	public void parkSmallVehicle(Vehicle vehicle);
	
	public ParkingType selectParkingType();
	
}
