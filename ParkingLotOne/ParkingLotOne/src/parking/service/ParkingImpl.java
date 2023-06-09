package parking.service;

import java.util.List;
import java.util.Scanner;

import parking.data.ParkingLot;
import parking.data.ParkingSpot;
import parking.data.Vehicle;
import parking.utility.ParkingSpotType;
import parking.utility.ParkingType;
import parking.utility.VehicleType;

public class ParkingImpl implements Parking {

	public ParkingLot parkingLot = new ParkingLot();
	
	@Override
	public void parkVehicle(Vehicle vehicle) {
	
		if(vehicle.getVehicleType().equals(VehicleType.LARGE))
		{
			if(parkingLot.getFreeLargeSpots()>0)
			{
				parkLargeVehicle(vehicle);
			}
			else 
			{
				System.out.println("No slots Available");
			}
		}
		else if(vehicle.getVehicleType().equals(VehicleType.MEDIUM))
		{
			if(parkingLot.getFreeLargeSpots()>0)
			{
				parkMediumVehicle(vehicle);
			}
			else if(parkingLot.getFreeMediumSpots()>0)
			{
				parkMediumVehicle(vehicle);
			}
			else
			{
				System.out.println("No slots Available");
			}
			
			
		}
		else if (vehicle.getVehicleType().equals(VehicleType.SMALL))
		{
			
			if(parkingLot.getFreeLargeSpots()>0)
			{
				parkSmallVehicle(vehicle);
			}
			else if(parkingLot.getFreeMediumSpots()>0)
			{
				parkSmallVehicle(vehicle);
			}
			else if(parkingLot.getFreeSmallSpots()>0)
			{
				parkSmallVehicle(vehicle);
			}
			else
			{
				System.out.println("No slots Available");
			}
			
		}
	}

	@Override
	public void parkLargeVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		ParkingSpot largeSpot = new ParkingSpot(ParkingSpotType.LARGE, null, null);
		largeSpot.setFree(false);
		largeSpot.setVehicle(vehicle);
		vehicle.setParkingspot(largeSpot);
		List<ParkingSpot> list = parkingLot.getLargeSpots();
		list.add(largeSpot);
		parkingLot.setLargeSpots(list);
		
	}

	@Override
	public void parkMediumVehicle(Vehicle vehicle) {
		ParkingSpot mediumSpot = new ParkingSpot(ParkingSpotType.MEDIUM, null, null);
		mediumSpot.setFree(false);
		mediumSpot.setVehicle(vehicle);
		vehicle.setParkingspot(mediumSpot);
		List<ParkingSpot> list = parkingLot.getMediumSpots();
		list.add(mediumSpot);
		parkingLot.setMediumSpots(list);
		
	}

	@Override
	public void parkSmallVehicle(Vehicle vehicle) {

		ParkingSpot smallSpot = new ParkingSpot(ParkingSpotType.SMALL, null, null);
		smallSpot.setFree(false);
		smallSpot.setVehicle(vehicle);
		vehicle.setParkingspot(smallSpot);
		List<ParkingSpot> list = parkingLot.getSmallSpots();
		list.add(smallSpot);
		parkingLot.setSmallSpots(list);
		
	}

	@Override
	public ParkingType selectParkingType() {
		System.out.println("\n Select Parking Type \n1.Regular \n2.Handicap \n3.Compact");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		switch(x)
		{
		case 1: return ParkingType.REGULAR;
		case 2: return ParkingType.HANDICAP;
		case 3: return ParkingType.COMPACT;
		}
		return ParkingType.REGULAR;
	}

}
