package parking.client;



import java.util.Scanner;

import parking.data.NearestGate;
import parking.data.ParkingLot;
import parking.data.Vehicle;
import parking.exception.ValetException;
import parking.utility.VehicleType;



public class UIClient {



	public static void main(String[] args) throws ValetException {
		System.out.println("PARKING LOT");
		int x=0;
		ParkingLot parkinglot = null;
		Vehicle vehicle;
		Scanner sc = new Scanner(System.in);
		int y=0;
		do
		{
			System.out.println("\t\t   Welcome To Parking System");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\t\t\t PARKING MENU");
			//System.out.println("\n 1. Add Parking Lot  \n2.Park Vehicle ");			
			int sm=0;
			int lg=0;
			int md =0;
			System.out.println("Which slot do you want ?");
			System.out.println("1. Small\tTwo-Wheeler");
			System.out.println("2. Medium\tCars");
			System.out.println("3. Large\tTrucks-Buses");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Number of parking slots :");
				sm=sc.nextInt();
				md=0;
				lg=0;
				break;
			case 2:
				System.out.println("Enter Number of parking slots :");
				md=sc.nextInt();
				sm=0;
				lg=0;
				
				break;
			case 3:
				System.out.println("Enter Number of parking slots :");
				lg=sc.nextInt();
				sm=0;
				md=0;
				break;
				
			default:
			}

			System.out.println("need Valet ?"); 
			String str = sc.next();
			boolean valet = str.equalsIgnoreCase("yes")? true : false;
			
			try {
				if (valet == false) {
					throw new ValetException("No Parking will be alloted...");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				break;
			}	
			parkinglot = new ParkingLot(valet,sm,md,lg); //created parking lot
			//int x=sm+md+lg;
			do
			{
				System.out.println("Enter Vehicle Model Name");
				String vdetails = sc.next();
				System.out.println("Enter Vehicle Number");
				String vno = sc.next();
				System.out.println("Enter Vehicle Type \t (Small , Medium , Large)");
				String vty = sc.next();
				
				System.out.println("Enter entry gate No");
				int gateNo = sc.nextInt();
				
				NearestGate gn = new NearestGate(gateNo);
				
				if(vty.equalsIgnoreCase(VehicleType.SMALL.toString()))
				{
					vehicle = new Vehicle(vno,VehicleType.SMALL, gn);
					parkinglot.parkVehicle(vehicle);
					parkinglot.unParkvehicle(vehicle);
					

				}
				else if(vty.equalsIgnoreCase(VehicleType.MEDIUM.toString()))
				{
					vehicle = new Vehicle(vno,VehicleType.MEDIUM,gn);
					parkinglot.parkVehicle(vehicle);
					parkinglot.unParkvehicle(vehicle);
					
				}
				else if(vty.equalsIgnoreCase(VehicleType.LARGE.toString()))
				{
					vehicle = new Vehicle(vno,VehicleType.LARGE,gn);
					parkinglot.parkVehicle(vehicle);
					parkinglot.unParkvehicle(vehicle);
					
				}
				else {
					System.out.println("Press 1 to re-enter details // Press 0 to Exit Parking");
					x=sc.nextInt();
				}
				
			}
			while(x==1);
			System.out.println("Press 1 to Add Parking Lot // Press 0 to Exit Parking Lot");
			y=sc.nextInt();
		}
		while(y==1);



	}
}