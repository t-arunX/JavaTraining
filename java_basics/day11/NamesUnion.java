package java_basics.day11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashSet;

public class NamesUnion {

    public static void main(String[] args) throws Exception {
        Path p1 = Paths.get("JavaTraining\\java_basics\\day11\\Files\\Names1.txt");
        Path p2 = Paths.get("JavaTraining\\java_basics\\day11\\Files\\Names2.txt");
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        //new line
        lhs.addAll(Files.readAllLines(p1));
        lhs.addAll(Files.readAllLines(p2));
        for (String s : lhs) {
            System.out.println(s);
        }

    }
}
