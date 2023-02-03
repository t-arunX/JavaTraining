package java_basics.day10;

import java.io.BufferedReader;
import java.io.FileReader;

public class TypeCounter {
    public static void main(String[] args) throws Exception {
        int val;
        int upper = 0;
        int lower = 0;
        int digits = 0;
        String source = "G:/java/core java/java_basics/day10/FileSamples/characterStream.txt";
        try (FileReader fr = new FileReader(source);
                BufferedReader br = new BufferedReader(fr);) {
            val = br.read();
            while (val != -1) {
                if (Character.isUpperCase(val))
                    upper++;
                else if (Character.isLowerCase(val))
                    lower++;
                else if (Character.isDigit(val))
                    digits++;
                val = br.read();
            }
        }
        System.out.println("Digits: " + digits + "\nLowercase: " + lower + "\nUppercase: " + upper);
    }
}
