public class Room {

	private int length;
	private int breadth;
	private int height;
	private int no_of_broken_lights;
	private int no_of_broken_fans;
	private int no_of_broken_tables;
	
	public Room(int length, int breadth, int height, int broken_lights, int broken_fans, int broken_tables) throws
	 InvalidDimensionException,InvalidBrokenAppliances{
		/*
		Set the relevant fields and in case of invalid (negative) input, 
		throw relevant exceptions i.e InvalidDimensionException and InvalidBrokenAppliances 
		*/
		if(length<=0 || breadth<=0 || height<=0) 
			throw new InvalidDimensionException(length,breadth,height);

		else if(broken_lights<0 || broken_tables<0 || broken_fans<0)
			throw new InvalidBrokenAppliances(broken_lights,broken_fans,broken_tables);

		else {
			this.length = length;
			this.breadth = breadth;
			this.height = height;
			this.no_of_broken_lights = no_of_broken_lights;
			this.no_of_broken_fans = no_of_broken_fans;
			this.no_of_broken_tables = no_of_broken_tables;
			}
	}

	public int calculateRepairingCost(){
		return (1*no_of_broken_lights + 2*no_of_broken_fans + 3*no_of_broken_tables);
	}
}
