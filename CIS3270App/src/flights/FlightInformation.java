package flights;

import java.util.ArrayList;

public class FlightInformation {
	private String departureTime;
	private String arrivalTime;
	private String departureDate;
	private String arrivalDate;
	private String departureYear;
	private String arrivalYear;
	private String departureLocation;
	private String arrivalLocation;
	private boolean roundTrip;
	private String flightNumber;
	
	
	
	public FlightInformation(String departureTime, String arrivalTime, String departureDate, String arrivalDate,
			String departureYear, String arrivalYear, String departureLocation, String arrivalLocation,
			boolean roundTrip, String flightNumber, ArrayList<String> flightList) {
		super();
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureYear = departureYear;
		this.arrivalYear = arrivalYear;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.roundTrip = roundTrip;
		this.flightNumber = flightNumber;
		this.flightList = flightList;
	}
	
	public void printFlightAvailibility() {
		System.out.println("There are " + flightList.size() + " flights available.");
		for(int i = 0; i < flightList.size(); i ++) {
			System.out.println((i + 1) + ". " + flightList.get(i));
		}
	}
	private void modifyFlight(String newFlight) {
		int position = searchFlight(newFlight);
		if(position >= 0) {
			System.out.println(position, newFlight);
	}
	public void removeFlight(int flightNumber1) {
		String  flightNumber2 = flightList.get(flightNumber1);
		flightList.remove(flightNumber1);
	}
	public int searchFlight(String search) {
			return flightList.indexOf(search);
		}
	
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getDepartureYear() {
		return departureYear;
	}
	public void setDepartureYear(String departureYear) {
		this.departureYear = departureYear;
	}
	public String getArrivalYear() {
		return arrivalYear;
	}
	public void setArrivalYear(String arrivalYear) {
		this.arrivalYear = arrivalYear;
	}
	public String getDepartureLocation() {
		return departureLocation;
	}
	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}
	public String getArrivalLocation() {
		return arrivalLocation;
	}
	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}
	public boolean isRoundTrip() {
		return roundTrip;
	}
	public void setRoundTrip(boolean roundTrip) {
		this.roundTrip = roundTrip;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public ArrayList<String> getFlightList() {
		return flightList;
	}
	private ArrayList<String>flightList = new ArrayList<String>();
	
	public void addArrivalCity(String flightInformation) {
		flightList.add(flightInformation);
	}
	public void  addArrivalDate(String flightInformation) {
		flightList.add(flightInformation);
	}
}
