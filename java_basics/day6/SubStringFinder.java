package java_basics.day6;

import java.util.Scanner;

public class SubStringFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Sentence!");
        String data = in.nextLine();
        System.out.println("Enter a substring!");
        String check = in.nextLine();
        in.close();
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
