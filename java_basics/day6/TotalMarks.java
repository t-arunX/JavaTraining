package java_basics.day6;

import java.util.Scanner;

public class TotalMarks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Marks in csv!!\n");
		String data = in.nextLine();
		in.close();
		String[] converted = data.split(",");
		int total = 0;
		for (String s : converted) {
			total += Integer.parseInt(s);
		}
		System.out.println("Total marks: " + total);
	}

}
