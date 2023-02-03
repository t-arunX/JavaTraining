package java_basics.day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class MarksCalculator {
    public static void main(String[] args) throws Exception {
        String destination = "java_basics/day10/FileSamples/result.txt";
        String source = "java_basics/day10/FileSamples/marks.txt";
        String s;
        int exceptionCount = 0;
        try (FileReader fr = new FileReader(source);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(destination)) {
            s = br.readLine();
            while (s != null) {
                if (s.length() == 0){
                    s = br.readLine();
                    fw.write("-\n");
                    continue;
                }
                int total = 0;
                String vals[] = s.split(",");
                for (String v : vals) {
                    try {
                        total += Integer.parseInt(v);
                    } catch (Exception e) {
                        exceptionCount++;
                    }
                }
                // System.out.println(total);
                fw.write(String.valueOf(total) + '\n');
                s = br.readLine();
            }
        }
        System.out.println("Exception count: "+exceptionCount);
    }
}
