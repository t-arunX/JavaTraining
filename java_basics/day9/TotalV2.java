package java_basics.day9;

import java.util.*;
public class TotalV2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		int sum=0,count=0;
		while(true)
		{
			try
			{
				sum+=Integer.parseInt(sc.nextLine());
				count++;
				if(count==5)
				{
					break;
				}
			}
			catch(NumberFormatException  ex) {
				System.out.println("Invalid");
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
