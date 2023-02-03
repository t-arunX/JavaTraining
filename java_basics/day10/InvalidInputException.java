package java_basics.day10;

public class InvalidInputException extends Exception {
	public InvalidInputException() {
		super("Invalid input entered");
	}
	public InvalidInputException(String msg) {
		super(msg);
	}
	// public InvalidInputException(int x){
	// 	super(String.valueOf(x));
	// }
}
