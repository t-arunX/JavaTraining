package java_basics.day10;

import java.io.FileWriter;
import java.util.Scanner;

public class FileNameStream {
    public static void main(String[] args) throws Exception {
        try (Scanner in = new Scanner(System.in);) {
            String s = in.nextLine();
            String source = "G:/java/core java/java_basics/day10/FileSamples/names.txt";
            try (FileWriter fw = new FileWriter(source)) {
                while (!s.equalsIgnoreCase("end")) {
                    fw.write(s + '\n');
                    s = in.nextLine();
                }
            }
        }
    }
}