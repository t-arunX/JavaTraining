package java_basics.day7;
import java.util.Scanner;
import java.util.StringJoiner;

public class NameStream {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		StringJoiner result = new StringJoiner("-");
		while(!s.equalsIgnoreCase("END")) {
			result.add(s);
			s = in.nextLine();
		}
		in.close();
		System.out.println(result.toString());
	}

}
