package java_basics.day12;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringToFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner in = new Scanner(System.in);
        String path = "JavaTraining\\java_basics\\day12\\files\\code.txt";
        String s = in.nextLine();
        ArrayList<String> dataList = new ArrayList<>();
        while (!s.equalsIgnoreCase("end")) {
            dataList.add(s);
            s = in.nextLine();
        }
        in.close();
        dataList.sort((a1, a2) -> a1.length() - a2.length());
        FileWriter fw = new FileWriter(path);
        for (String temp : dataList)
            fw.write(temp + '\n');
        fw.close();
        Path p = Paths.get(path);
        dataList.clear();
        dataList.addAll(Files.readAllLines(p));
        String patternCheck = "[a-zA-Z]+[1-9]+";
        for (String itr : dataList) {
            if (!Pattern.matches(patternCheck, itr)) {
                System.out.println("invalid File!");
                return;
            }
        }
        // System.out.println(dataList);
        System.out.println("valid File");
        in.close();
    }
}
