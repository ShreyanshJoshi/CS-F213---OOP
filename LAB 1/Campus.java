public class Campus {
	private int dormCount;
	static final int MAX_DORMS=10;
	private Dorm[] dormList;
	//---------------------------------------------
	public Campus() {
		dormList = new Dorm[MAX_DORMS];
		dormCount=0;
	}

	public boolean addDorm(int capacity) {
		if(dormCount<MAX_DORMS) {
			dormList[dormCount]= new Dorm(capacity);
			dormCount+=1;
			return true;
		}
		else
			return false;
	}

	public int getFurnitureCount() {
		int sum=0,i;
		for(i=0;i<dormCount;i++)
			sum+=dormList[i].getFurnitureCount();

		return sum;
	}

	public boolean insertFurniture(int index, String furniture) {
		if(dormList[index].getFurnitureCount()<10 && (index>=0 && index<dormCount)) {
			dormList[index].addFurniture(furniture);
			return true;
		}
		else
			return false;
	}

	public boolean checkIn() {
		int i;
		for(i=0;i<dormCount;i++) {
			if(dormList[i].getGuestCount()==0) {
				dormList[i].checkIn();
				return true;
			}			
		}
		return false;
	}

	public boolean checkIn(int index) {
		dormList[index].checkIn();
		if(index<dormCount)
			return true;
		else
			return false;
	}

	public boolean checkOut(int index) {
		if(index>0 && dormList[index].getGuestCount()>0) {
			dormList[index].checkOut();
			return true;
		}
		else
			return false;
	}

}
