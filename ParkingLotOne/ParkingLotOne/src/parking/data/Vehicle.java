package parking.data;

import parking.utility.VehicleType;

public class Vehicle {

	private String vehicleNo;
	private VehicleType vehicleType;
	private ParkingSpot parkingspot;
	private NearestGate entryGate;


	public Vehicle(String vehicleNo, VehicleType vehicleType, NearestGate entryGate) {
		super();
		this.vehicleNo = vehicleNo;
		this.vehicleType = vehicleType;
		this.entryGate = entryGate;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public ParkingSpot getParkingspot() {
		return parkingspot;
	}
	public void setParkingspot(ParkingSpot parkingspot) {
		this.parkingspot = parkingspot;
	}



	public NearestGate getEntryGate() {
		return entryGate;
	}
	public void setEntryGate(NearestGate entryGate) {
		this.entryGate = entryGate;
	}
	
	@Override
	public String toString() {
		return "Vehicle [vehicleNo=" + vehicleNo + ", vehicleType=" + vehicleType + "]";
	}







}
