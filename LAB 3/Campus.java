import java.util.*;
public class Campus {
	private static String name;
	private int hostelCount;
	private Hostel[] hostels;
	private AcadBlock acadBlock;
	static int MAX_NUMBER_OF_HOSTELS=10;

	public Campus(String name,AcadBlock acadBlock) {
		this.name = name;
		this.acadBlock = acadBlock;
		hostels = new Hostel[MAX_NUMBER_OF_HOSTELS];
		hostelCount=0;
	}

	public static String getName() {
		return name;
	}

	public boolean addHostel​(String hostelName) {
		if(hostelCount<MAX_NUMBER_OF_HOSTELS) {
			hostels[hostelCount] = new Hostel(hostelName);
			hostelCount+=1;
			return true;
		}
		else
			return false;
	}

	public int calculateCampusMaintenance​() {
		int sum=0;
		for(int i=0;i<hostelCount;i++) {
			sum+=hostels[i].calculateMaintenanceCost​();
		}
		sum+=acadBlock.calculateMaintenanceCost​();
		return sum;
	}
}