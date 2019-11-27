/**
 * A dorm is a part of a Campus.
 * @author Arshdeep Singh, Mayur Jartarkar
 * @version August 20, 2019
*/
public class Dorm {
	private int capacity;
	private int furnitureCount;
	private int guestCount;
	static final int MAX_FURNITURES= 10;
	private String [] furnitureList;
	//-----------------------------------------
	public Dorm(int capacity) {
		this.capacity = capacity;
		furnitureList = new String[MAX_FURNITURES];
		guestCount=0;
		furnitureCount=0;
	}

	public boolean addFurniture(String s) {
		if(furnitureCount<MAX_FURNITURES) {
			furnitureList[furnitureCount] = s;
			furnitureCount+=1;
			return true;
		}
		else 
			return false;
	}

	public int getFurnitureCount() {
		return furnitureCount;
	}

	public String getFurniture(int index) {
		if(index<furnitureCount)
			return furnitureList[index];
		else
			return null;
	}

	public boolean checkIn() {
		if(guestCount<capacity) {
			guestCount+=1;
			return true;
		}
		else
			return false;
	}

	public boolean checkOut() {
		if(guestCount>0) {
			guestCount-=1;
			return true;
		}
		else
			return false;
	}

	public int getGuestCount() {
		return guestCount;
	}

	public int getEmptyCapacity() {
		return capacity-guestCount;
	}
}
