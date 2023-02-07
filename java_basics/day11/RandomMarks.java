package java_basics.day11;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomMarks {

	public static void main(String[] args) throws IOException {
		try (RandomAccessFile raf = new RandomAccessFile("./src/assignment_10/sample/marks.dat","rw")) {
			int x=0;
			for(int i=1;i<=20;i++) {
				x = (int)(Math.random()*100);
				raf.writeInt(x);
			}
			raf.seek(0);
			for(int i=1;i<=20;i++) System.out.println(raf.readInt());
		}
	}

}
