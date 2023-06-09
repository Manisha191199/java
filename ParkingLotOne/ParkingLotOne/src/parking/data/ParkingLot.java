package parking.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import parking.utility.ParkingSpotType;
import parking.utility.ParkingType;
import parking.utility.VehicleType;

public class ParkingLot {

	private List<ParkingSpot> smallSpots = new ArrayList<>(); //many small spots // 1 small spot uski value mujhe set  
	private List<ParkingSpot> mediumSpots = new ArrayList<>();
	private List<ParkingSpot> largeSpots = new ArrayList<>();
	private boolean valet;
	private int totalspots;
	private int freeSmallSpots;
	private int freeMediumSpots;
	private int freeLargeSpots;
	private ParkingSpot parking = new ParkingSpot();;
	private Map<Vehicle,Ticket> details = new HashMap<>();

	public ParkingLot(boolean valet, int freeSmallSpots, int freeMediumSpots, int freeLargeSpots) {
		super();
		this.valet = valet;
		this.freeSmallSpots = freeSmallSpots;
		this.freeMediumSpots = freeMediumSpots;
		this.freeLargeSpots = freeLargeSpots;
	}


	public ParkingLot() {
		// TODO Auto-generated constructor stub
	}


	public List<ParkingSpot> getSmallSpots() {
		return smallSpots;
	}


	public void setSmallSpots(List<ParkingSpot> smallSpots) {
		this.smallSpots = smallSpots;
	}


	public List<ParkingSpot> getMediumSpots() {
		return mediumSpots;
	}


	public void setMediumSpots(List<ParkingSpot> mediumSpots) {
		this.mediumSpots = mediumSpots;
	}


	public List<ParkingSpot> getLargeSpots() {
		return largeSpots;
	}


	public void setLargeSpots(List<ParkingSpot> largeSpots) {
		this.largeSpots = largeSpots;
	}


	public boolean isValet() {
		return valet;
	}


	public void setValet(boolean valet) {
		this.valet = valet;
	}


	public int getTotalspots() {
		return totalspots;
	}


	public void setTotalspots(int totalspots) {
		this.totalspots = totalspots;
	}


	public int getFreeSmallSpots() {
		return freeSmallSpots;
	}


	public void setFreeSmallSpots(int freeSmallSpots) {
		this.freeSmallSpots = freeSmallSpots;
	}


	public int getFreeMediumSpots() {
		return freeMediumSpots;
	}


	public void setFreeMediumSpots(int freeMediumSpots) {
		this.freeMediumSpots = freeMediumSpots;
	}


	public int getFreeLargeSpots() {
		return freeLargeSpots;
	}


	public void setFreeLargeSpots(int freeLargeSpots) {
		this.freeLargeSpots = freeLargeSpots;
	}

	//PArking Methods..................

	public void parkVehicle(Vehicle vehicle) {

		if(vehicle.getVehicleType().equals(VehicleType.LARGE))
		{
			if(getFreeLargeSpots()>0)
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
			if(getFreeMediumSpots()>0)
			{
				parkMediumVehicle(vehicle);
			}
			else if(getFreeLargeSpots()>0)
			{
				parkLargeVehicle(vehicle);
			}
			else
			{
				System.out.println("No slots Available");
			}


		}
		else if (vehicle.getVehicleType().equals(VehicleType.SMALL))
		{

			if(getFreeSmallSpots()>0)
			{
				parkSmallVehicle(vehicle);
			}
			else if(getFreeMediumSpots()>0)
			{
				parkMediumVehicle(vehicle);
			}
			else if(getFreeSmallSpots()>0)
			{
				parkLargeVehicle(vehicle);
			}
			else
			{
				System.out.println("No slots Available");
			}

		}
	}


	public void parkLargeVehicle(Vehicle vehicle ) {
		// TODO Auto-generated method stub
		ParkingSpot largeSpot = new ParkingSpot(ParkingSpotType.LARGE, null ,null);
		//ParkingSpot largeSpot = new ParkingSpot(ParkingSpotType.LARGE, ParkingType.REGULAR ,vehicle.getEntryGate());
		largeSpot.setFree(false);
		largeSpot.setVehicle(vehicle);
		largeSpot.setParkingType(parking.setParkingSpottype());
		totalspots=freeLargeSpots+freeSmallSpots+freeMediumSpots;
		largeSpot.setSpotNo(totalspots-freeLargeSpots);
		vehicle.setParkingspot(largeSpot);
		largeSpots.add(largeSpot);
		//System.out.println(largeSpots);
		--freeLargeSpots;
		vacantparking();
		Ticket ticket = new Ticket();
		System.out.println("---------------Ticket Generated -----------------------");
		System.out.println(ticket.generateTicket(largeSpot,vehicle));
		details.put(vehicle, ticket);
	}


	public void parkMediumVehicle(Vehicle vehicle) {
		ParkingSpot mediumSpot = new ParkingSpot(ParkingSpotType.MEDIUM,ParkingType.REGULAR ,vehicle.getEntryGate() );
		mediumSpot.setFree(false);
		mediumSpot.setVehicle(vehicle);
		mediumSpot.setParkingType(parking.setParkingSpottype());
		totalspots=freeLargeSpots+freeSmallSpots+freeMediumSpots;
		mediumSpot.setSpotNo(totalspots-freeMediumSpots);
		vehicle.setParkingspot(mediumSpot);
		mediumSpots.add(mediumSpot);
		//System.out.println(mediumSpots);
		--freeMediumSpots;
		vacantparking();
		Ticket ticket = new Ticket();
		System.out.println("------------Ticket Generated ---------");
		System.out.println(ticket.generateTicket(mediumSpot,vehicle));
		details.put(vehicle, ticket);

	}

	public void parkSmallVehicle(Vehicle vehicle) {

		ParkingSpot smallSpot = new ParkingSpot(ParkingSpotType.SMALL,ParkingType.REGULAR ,vehicle.getEntryGate());
		smallSpot.setFree(false);
		smallSpot.setVehicle(vehicle);
		smallSpot.setParkingType(parking.setParkingSpottype());
		totalspots=freeLargeSpots+freeSmallSpots+freeMediumSpots;
		smallSpot.setSpotNo(totalspots-freeSmallSpots);
		vehicle.setParkingspot(smallSpot);
		smallSpots.add(smallSpot);
		//System.out.println(smallSpots);
		--freeSmallSpots;
		vacantparking();
		Ticket ticket = new Ticket();
		System.out.println("----------Ticket Generated ---------");
		System.out.println(ticket.generateTicket(smallSpot,vehicle));
		details.put(vehicle, ticket);
	}

	public void vacantparking()
	{	
		totalspots=freeLargeSpots+freeSmallSpots+freeMediumSpots;
		System.out.println("\n total Spots :"+totalspots);
		System.out.println("\n small Spots :"+freeSmallSpots);
		System.out.println("\n medium Spots :"+freeMediumSpots);
		System.out.println("\n large Spots :"+freeLargeSpots);
	}

	public void unParkvehicle(Vehicle vehicle)
	{
		// TODO Auto-generated method stub
		System.out.println("Do you want to Unpark Vehicle");
		Scanner sc = new Scanner(System.in);
		String ch = sc.next();
		if(ch.equalsIgnoreCase("yes"))
		{
			try {
				
	
			System.out.println(" \n Upparking Logic");
			ParkingSpot parkingSpot = vehicle.getParkingspot();
			parkingSpot.setFree(true);
			
			if(vehicle.getVehicleType().equals(VehicleType.LARGE))
			{
				if(largeSpots.remove(vehicle.getParkingspot()))
				{
					System.out.println("\n Unpark Successfull");
					freeLargeSpots++;
					System.out.println(largeSpots);
					vacantparking();
				}
				else
				{
					System.out.println("you dont have Vehicle Parked");
				}
			}
			else if(vehicle.getVehicleType().equals(VehicleType.MEDIUM))
			{
				if(mediumSpots.remove(vehicle.getParkingspot()))
				{
					System.out.println("\n Unpark Successfull");
					freeMediumSpots++;
					System.out.println(mediumSpots);
					vacantparking();
				}
				
				else
				{
					System.out.println("you dont have Vehicle Parked");
				}
				
			}
			else if(vehicle.getVehicleType().equals(VehicleType.SMALL))
			{
				if(smallSpots.remove(vehicle.getParkingspot()))
				{
					System.out.println("\n Unpark Successfull");
					freeSmallSpots++;
					System.out.println(smallSpots);
					vacantparking();
				}
				else
				{
					System.out.println("you dont have Vehicle Parked");
				}
			}
			}
			catch(NullPointerException e) {
				System.out.println("You dont have vehicle parked");
			}

		}
		else
		{
			System.out.println("running....");
			
		}



	}
}
