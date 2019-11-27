import java.util.*;
public class HostelRoom extends Room {
	private boolean[] workingAppliances;
	static int NUMBER_OF_APPLIANCES=3;

	public HostelRoom​(int length,int breadth,int height) {
		super(length,breadth,height);
		workingAppliances = new boolean[NUMBER_OF_APPLIANCES];
		for(int i=0;i<NUMBER_OF_APPLIANCES;i++) {
			workingAppliances[i] = false;
		}
	}

	public void setStateOfAppliances​(String state) {
		StringTokenizer x = new StringTokenizer(state,",");
		String c = x.nextToken(",");
		c = c.toLowerCase();
		if(c.equals("true"))
			workingAppliances[0] = true;

		c = x.nextToken(",");
		c = c.toLowerCase();
		if(c.equals("true"))
			workingAppliances[1] = true;

		c = x.nextToken(",");
		c = c.toLowerCase();
		if(c.equals("true"))
			workingAppliances[2] = true;

	}

	public int calculateMaintenanceCost​() {
		int base_cost = super.calculateMaintenanceCost​();
		if(workingAppliances[0]==false)
			base_cost+=5;

		if(workingAppliances[1]==false)
			base_cost+=3;

		if(workingAppliances[2]==false)
			base_cost+=2;
		return base_cost;
	}
}