package java_basics.day10;

import java.io.BufferedReader;
import java.io.FileReader;

public class MoreThanfive {
    public static void main(String[] args) throws Exception {
        String source = "G:/java/core java/java_basics/day10/FileSamples/5characters.txt";
        String s;
        try (FileReader fr = new FileReader(source);
                BufferedReader br = new BufferedReader(fr);) {
                s = br.readLine();
            while (s != null) {
                if(s.length()>5) System.out.println(s);
                s = br.readLine();
            }
        }
    }
}
