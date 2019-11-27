public class MaximumCapacityException extends java.lang.Exception {
	public MaximumCapacityException​(String type, String name) {
		super(type+ " capacity limit reached in "+name);
	}	
}
