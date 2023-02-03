package java_basics.day6;
public class NumberGuessing {

	public static void main(String[] args) {
		int range = 25;
		int num = (int) (java.lang.Math.random() * range);
		int iter = 3;
		try (java.util.Scanner in = new java.util.Scanner(System.in)) {
			System.out.println("Guess a number below 25!!\n");
			while (iter-- > 0) {
				int userInput = in.nextInt();
				if (userInput == num) {
					System.out.println("YOU WIN!!");
					return;
				} else {
					if (userInput > range || userInput < 0)
						System.out.println("That's out of range, Try again!\n");
					else if (userInput > num)
						System.out.println("Try something lower than that!\n");
					else if (userInput < num)
						System.out.println("Try something higher than that!\n");
				}
			}
			in.close();
		}
		System.out.println("Nice try, Better Luck NextTime!");
	}
}
