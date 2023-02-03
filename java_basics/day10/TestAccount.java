package java_basics.day10;

public class TestAccount {

	public static void main(String[] args) {
		//pass them -->name , id ,(optional)balance 
		try {
		Account a1 = new Account("vamsi",12,6000);
		a1.deposit(-12);
		a1.withDraw(7000);
		System.out.println(a1.getBalance());
		}catch(InvalidInputException e) {
			System.out.println(e);
		}
	}

}
