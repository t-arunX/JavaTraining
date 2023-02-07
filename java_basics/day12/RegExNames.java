package java_basics.day12;

import java.util.regex.Pattern;

public class RegExNames {
    public static void main(String[] args) {
        String s = "mark@zubin@peter@Christofer@Emily@%%$%Quintin#roman$roberto";
        Pattern p = Pattern.compile("[\\W]+");
        String names[] = p.split(s);
        for (String temp : names)
            System.out.println(temp);
    }
}
