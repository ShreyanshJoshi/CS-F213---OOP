import java.util.*;
public class Room {
	private int length;
	private int breadth;
	private int height;

	public Room​(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public int getVolume​() {
		return length*breadth*height;
	}

	public int getSurfaceArea() {
		return 2*(length*breadth + breadth*height + length*height);
	}

	public int calculateMaintenanceCost​() {
		return 5* getVolume​() + 2* getSurfaceArea();
	}
}