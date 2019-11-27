public class invalidDeviceException extends java.lang.Exception {
	public invalidDeviceException​(String roomType,String appliance) {
		super(roomType+" cannot have appliance "+appliance);
	}
}
