import java.util.*;
public class ClassRoom extends Room {
	private boolean isAcOn;
	private boolean areLightsOn;

	public ClassRoom​(int length,int breadth,int height) {
		super(length,breadth,height);
		isAcOn=false;
		areLightsOn = false;
	}

	public void flipApplianceState​(String appliance) {
		if(appliance.equals("AC")) {
			if(isAcOn==true)
				isAcOn=false;
			else
				isAcOn=true;
		}

		if(appliance.equals("Lights")) {
			if(areLightsOn==true)
				areLightsOn=false;
			else
				areLightsOn=true;
		}
	}

	public int calculateMaintenanceCost​() {
		int base_cost = super.calculateMaintenanceCost​();
		if(isAcOn==true)
			base_cost+=10;

		if(areLightsOn==true)
			base_cost+=5;

		return base_cost;
	}
}