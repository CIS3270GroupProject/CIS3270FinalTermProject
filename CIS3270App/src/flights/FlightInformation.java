import java.util.ArrayList;

public class FlightInformation {
	private ArrayList<String>flightList = new ArrayList<String>();
	
	public void addArrivalCity(String flightInformation) {
		flightList.add(flightInformation);
	}
	public void  addArrivalDate(String flightInformation) {
		flightList.add(flightInformation);
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
			modifyFlight(position, newFlight);
	}
	public void removeFlight(int flightNumber1) {
		String  flightNumber2 = flightList.get(flightNumber1);
		flightList.remove(flightNumber1);
	}
	public int searchFlight(String search) {
			return flightList.indexOf(search);
		}
	}
