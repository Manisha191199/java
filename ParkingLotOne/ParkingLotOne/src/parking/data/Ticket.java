package parking.data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket {

	private Long id;
	private String inTime;
	private Vehicle vehicle;
	private ParkingSpot allottedParkingSpot;
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public ParkingSpot getAllottedParkingSpot() {
		return allottedParkingSpot;
	}
	public void setAllottedParkingSpot(ParkingSpot allottedParkingSpot) {
		this.allottedParkingSpot = allottedParkingSpot;
	}



	@Override
	public String toString() {
	return "Ticket Details \n id=" + id + "\n inTime=" + inTime + "\n vehicle=" + vehicle + "\n allottedParkingSpot="
			+ allottedParkingSpot ;
	}
	public Ticket generateTicket(ParkingSpot spot , Vehicle vehicle)
	{
		Ticket ticket = new Ticket();
		long b = (long)(Math.random()*100);
		System.out.println(b);
		ticket.setVehicle(vehicle);
		ticket.setId(b);
		Date date = new Date();  
		System.out.println(formatter.format(date));
		ticket.setInTime(formatter.format(date));
		ticket.setAllottedParkingSpot(spot);
		return ticket;



	}

}
