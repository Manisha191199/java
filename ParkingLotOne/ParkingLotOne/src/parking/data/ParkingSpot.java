package parking.data;

import java.util.Scanner;

import parking.utility.ParkingSpotType;
import parking.utility.ParkingType;

public class ParkingSpot {

	private ParkingSpotType spotType;
	private ParkingType parkingType;
	private Vehicle vehicle;
	private Boolean free;
	private NearestGate nearestGate;
	private Integer spotNo;

	public ParkingSpot(ParkingSpotType spotType, ParkingType parkingType, Vehicle vehicle, Boolean free,
			NearestGate nearestGate2) {
		super();
		this.spotType = spotType;
		this.parkingType = parkingType;
		this.vehicle = vehicle;
		this.free = free;
		this.nearestGate = nearestGate2;
	}

	public ParkingSpot(ParkingSpotType spotType, ParkingType parkingType , NearestGate nearestGate) {
		super();
		this.spotType = spotType;
		this.parkingType = parkingType;
		this.nearestGate=nearestGate;
	}

	public ParkingSpot() {
	}

	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Boolean getFree() {
		return free;
	}
	public void setFree(Boolean free) {
		this.free = free;
	}

	public int getSpotNo() {
		return spotNo;
	}

	public void setSpotNo(int parkingSpotNo) {
		this.spotNo = parkingSpotNo;
	}


	public NearestGate getNearestGate() {
		return nearestGate;
	}

	public void setNearestGate(NearestGate nearestGate) {
		this.nearestGate = nearestGate;
	}

	public ParkingSpotType getSpotType() {
		return spotType;
	}

	public void setSpotType(ParkingSpotType spotType) {
		this.spotType = spotType;
	}

	public ParkingType getParkingType() {
		return parkingType;
	}

	public void setParkingType(ParkingType parkingType) {
		this.parkingType = parkingType;
	}

	public ParkingType setParkingSpottype()
	{
		System.out.println("Enter Parking Type \t (Regular , Compact , Hand icap)");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(str.equalsIgnoreCase(ParkingType.REGULAR.toString()))
		{
			return ParkingType.REGULAR;
		}
		else if(str.equalsIgnoreCase(ParkingType.COMPACT.toString()))
		{
			return ParkingType.COMPACT;
		}
		else if(str.equalsIgnoreCase(ParkingType.HANDICAP.toString()))
		{
			return parkingType.HANDICAP;
		}
		return ParkingType.REGULAR;
	}

	@Override
	public String toString() {
		return "ParkingSpot [spotType = " + spotType + "],[ parkingType = " + parkingType 
				+ "],[ spotNo = " + spotNo + "]";
	}

	








}
