package java_basics.day9;

import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int iter = 0;
        int repeat = 5;
        int total = 0;
        while (iter < repeat) {
            try {
                iter++; //v1
                String str = in.nextLine();
                int num = Integer.parseInt(str);
                total += num;
                // iter++; //v2
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        in.close();
        System.out.println(total);
    }
}
