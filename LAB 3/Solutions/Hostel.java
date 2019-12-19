import java.util.*;
public class Hostel extends CampusBuilding {
	private HostelRoom[] hostelRooms;
	static int MAX_NUMBER_OF_HOSTEL_ROOMS=100;

	public Hostel​(String name) {
		super(name);
		hostelRooms = new HostelRoom[MAX_NUMBER_OF_HOSTEL_ROOMS];
	}

	public boolean addHostelRoom​(HostelRoom hostelRoom) {
		if(numberOfRooms<MAX_NUMBER_OF_HOSTEL_ROOMS ) {
			hostelRooms[numberOfRooms] = hostelRoom;
			numberOfRooms+=1;
			return true;
		}
		else
			return false;
	}

	public int calculateMaintenanceCost​() {
		int sum=0;
		for(int i=0;i<numberOfRooms;i++) {
			sum+=hostelRooms[i].calculateMaintenanceCost​();
		}
		return sum;
	}
}