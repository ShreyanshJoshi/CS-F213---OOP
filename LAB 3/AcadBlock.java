import java.util.*;
public class AcadBlock extends CampusBuilding {
	private ClassRoom[] classRooms;
	static int MAX_NUMBER_OF_CLASS_ROOMS=200;

	public AcadBlock​(String name) {
		super(name);
		classRooms = new ClassRoom[MAX_NUMBER_OF_CLASS_ROOMS];
	}

	public boolean addClassRoom​(ClassRoom classRoom) {
		if(numberOfRooms<MAX_NUMBER_OF_CLASS_ROOMS) {
			classRooms[numberOfRooms] =classRoom;
			numberOfRooms+=1;
			return true;
		}
		return false;
	}

	public int calculateMaintenanceCost​() {
		int sum=0;
		for(int i=0;i<numberOfRooms;i++) {
			sum+=classRooms[i].calculateMaintenanceCost​();
		}
		return sum;
	}
}