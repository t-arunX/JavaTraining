package java_basics.day11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;

public class UniqueNames {
    public static void main(String[] args) throws Exception {
        Path p = Paths.get("JavaTraining\\java_basics\\day11\\Files\\Names.txt");
        List<String> names = Files.readAllLines(p);
        HashSet<String> hs = new HashSet<>(names);
        for (String s : hs) {
            System.out.println(s);
        }
    }
}
