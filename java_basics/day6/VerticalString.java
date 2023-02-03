package java_basics.day6;
import java.util.Scanner;

public class VerticalString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string!\n");
		String data = in.nextLine();
		in.close();
		for(int i=0;i<data.length();i++) {
			System.out.println(data.charAt(i));
		}
		return;
	}

}
