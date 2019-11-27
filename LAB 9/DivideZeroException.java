class DivideZeroException extends java.lang.Exception {
	public DivideZeroException​(String type) {
		super("Cannot calculate average cost because number of "+type+" are insufficient");
	}
}
