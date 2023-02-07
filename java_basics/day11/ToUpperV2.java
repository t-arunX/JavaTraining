package java_basics.day11;

import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ToUpperV2 {
    public static void main(String[] args) throws Exception {
        Path p = Paths.get("JavaTraining\\java_basics\\day11\\Files\\Names.txt");
        try (RandomAccessFile raf = new RandomAccessFile(p.toString(), "rw");
                Scanner in = new Scanner(System.in);) {
            int x = Character.toUpperCase(raf.read());
            int c = 0;
            while (x != -1) {
                raf.seek(++c - 1);
                raf.write(x);
                x = Character.toUpperCase(raf.read());
            }
        }
    }
}