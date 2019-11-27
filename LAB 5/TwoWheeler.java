public class TwoWheeler extends Vehicle {
	public static final int TWO_WHEELER_MAX_LENGTH=10;
	public static final int TWO_WHEELER_MAX_WIDTH=3;
	public static final int TWO_WHEELER_MAX_COST=15;

	public TwoWheeler(String name, int length, int width, int cost) {
		super(name,length,width,cost);
		numWheels = 2;
	}

	public boolean verifyValidity() {
		if(length<= TWO_WHEELER_MAX_LENGTH && (width<=TWO_WHEELER_MAX_WIDTH && cost<=TWO_WHEELER_MAX_COST))
			return true;
		else
			return false;
	}

	public String getInfo() {
		return toString()+"\n"+ "Wheels : "+ numWheels;
	}
}
