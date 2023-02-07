package java_basics.day12;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpaceTrimV2 {
    public static void main(String[] args) throws IOException {
        String pattern = " +";
        String replaceWithPattern = " ";
        String filePath = "JavaTraining\\java_basics\\day12\\files\\data.txt";
        Pattern p = Pattern.compile(pattern);
        try (RandomAccessFile raf = new RandomAccessFile(filePath, "rw");) {
            String data = raf.readLine();
            int pointer = 1;
            while (data != null) {
                int lengthOfLine = data.length();
                pointer += lengthOfLine;
                Matcher m = p.matcher(data);
                String filtered = m.replaceAll(replaceWithPattern);
                raf.seek(pointer - lengthOfLine); // goes back to the beggining of line
                raf.writeChars(filtered+'\n');
                data = raf.readLine();
            }
            System.out.println("Done!");


            raf.seek(0);
            data = raf.readLine();
            while (data != null) {
                data = raf.readLine();
            }
        }
        
    }
}
