package java_basics.day11;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class SearchMarks {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (RandomAccessFile raf = new RandomAccessFile("./src/assignment_10/sample/marks.dat", "rw");
				Scanner in = new Scanner(System.in);) {
			System.out.println("enter roll number: ");
			int x = in.nextInt();
			x = (x - 1) * 4;
			raf.seek(x);
			System.out.println(raf.readInt());
		}
	}

}
