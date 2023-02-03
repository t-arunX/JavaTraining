package java_basics.day10;

import java.util.Scanner;

public class Until0 {

	public static void main(String[] args) {
		int total = 0;
		int num = 0;
		try(Scanner in = new Scanner(System.in)){
			num = in.nextInt();
			while(num!=0){
				try {
					if(num>0) total+=num;
					num = in.nextInt();
				}catch(Exception e) {
					in.next();
					System.out.println(e);
				}
			}	
		}
		System.out.println(total);
	}
}
