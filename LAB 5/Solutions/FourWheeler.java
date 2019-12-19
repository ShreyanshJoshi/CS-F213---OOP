public class FourWheeler extends Vehicle {
	public static final int FOUR_WHEELER_MAX_LENGTH=20;
	public static final int FOUR_WHEELER_MAX_WIDTH=10;
	public static final int FOUR_WHEELER_MAX_COST=45;

	public FourWheeler(String name, int length, int width, int cost) {
		super(name,length,width,cost);
		numWheels = 4;
	}

	public boolean verifyValidity() {
		if(length<= FOUR_WHEELER_MAX_LENGTH && (width<=FOUR_WHEELER_MAX_WIDTH && cost<=FOUR_WHEELER_MAX_COST))
			return true;
		else
			return false;
	}

	public String getInfo() {
		return toString()+"\n"+ "Wheels : "+ numWheels;
	}
}
