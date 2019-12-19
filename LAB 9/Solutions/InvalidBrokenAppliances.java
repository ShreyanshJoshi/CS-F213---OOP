public class InvalidBrokenAppliances extends java.lang.Exception {
	private int no_of_broken_fans;
	private int no_of_broken_tables;
	private int no_of_broken_lights;

	public InvalidBrokenAppliances​(int broken_lights,int broken_fans,int broken_tables) {
		this.no_of_broken_lights = no_of_broken_lights;
		this.no_of_broken_tables = no_of_broken_tables;
		this.no_of_broken_fans = no_of_broken_fans;
	}
	public String getMessage() {
		return "Number of broken appliances invalid.";
	}
}
