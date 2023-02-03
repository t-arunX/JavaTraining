package java_basics.day6;
import java.util.Scanner;

public class SpaceFinder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string!\n");
		String data = in.nextLine();
		in.close();
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)==' ') {
				System.out.print(i+" ");
			}
		}
		return;
	}

}
