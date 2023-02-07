package java_basics.day12;

// import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpaceTrim {
    public static void main(String[] args) throws IOException {
        String pattern = " +";
        String replaceWithPattern = " ";
        String filePath = "JavaTraining\\java_basics\\day12\\files\\data.txt";
        Pattern p = Pattern.compile(pattern);
        try (RandomAccessFile raf = new RandomAccessFile(filePath, "rw");) {
            String temp = raf.readLine();
            String data = "";
            while (temp != null) {
                Matcher m = p.matcher(temp);
                String filtered = m.replaceAll(replaceWithPattern);
                data += filtered+"\n";
                temp = raf.readLine();
            }
            raf.seek(0);
            raf.writeChars(data);
            // System.out.println(data);
        }
    }
}
