package java_basics.day9;

import java.util.Scanner;

public class TotalSuryaV1 {
    public static void main(String[] args) {
        String s;
        int sum = 0;
        int n, i = 0;
        System.out.println("enter the strings");
        Scanner sc = new Scanner(System.in);
            while (i < 5) {
                try {
                    i++;//v1
                    s = sc.nextLine();
                    n = Integer.parseInt(s);
                    sum += n;
                    // i++;//v2
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number");
                }
            }
            System.out.println("sum = " + sum);
    }
}


