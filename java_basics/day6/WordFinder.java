package java_basics.day6;

import java.util.Scanner;

public class WordFinder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Search.v1(in.nextLine(), in.nextLine());
		in.close();
	}
}

class Search {
	public static void v1(String data, String check) {
		for (int i = 0; i < data.length(); i++) {
			int k = 0;
			for (int j = i; j < data.length(); j++) {
				if (data.charAt(j) != check.charAt(k)) {
					break;
				} else if (check.length() - 1 == k) {
					System.out.print(i + " ");
					i += k;
					break;
				}
				k++;
			}
		}
	}

	public static void v2(String data, String check) {
		for (int i = 0; i < data.length(); i++) {
			for (int j = i; j < data.length(); j++) {
				if (data.charAt(j) != check.charAt(j - i)) {
					break;
				} else if (check.length() - 1 == j - i) {
					System.out.print(i + " ");
					i += j - i;
					break;
				}
			}
		}
	}
}