public class InvalidStateException extends java.lang.Exception {
	public InvalidStateException() {
		super("Invalid state given. Possible states are true and false only.");
	}
}
