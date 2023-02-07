package java_basics.day12;

import java.util.regex.Pattern;

public class PanValidator {

	public static void main(String[] args) {
		String pan = "GTEPK0451N";
		if(Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]",pan)) {
			System.out.println("Valid PAN!");
		}
		else System.out.println("Invalid!");
	}

}
