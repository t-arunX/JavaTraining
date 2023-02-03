package java_basics.day10;

interface AccountOperations {
	public void deposit(int amount) throws InvalidInputException;

	public void withDraw(int amount) throws InvalidInputException;

	public double getBalance() throws InvalidInputException;
}

public class Account implements AccountOperations {
	public static int MINIMUM_BALANCE = 2000;
	private String name;
	private int id;
	private double balance;

	public Account(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Account(String name, int id, double balance) throws InvalidInputException {
		super();
		this.name = name;
		this.id = id;
		if (balance < 0)
			throw new InvalidInputException("There cannot be a negative balance");
		this.balance = balance;
	}

	public String getDetails() {
		return ("id: " + id + "name: " + name);
	}

	@Override
	public void deposit(int amount) throws InvalidInputException {
		if (amount < 1)
			throw new InvalidInputException("You cannot deposit below 1");
		this.balance += amount;
	}

	@Override
	public void withDraw(int amount) throws InvalidInputException {
		if (this.balance - amount < 0)
			throw new InvalidInputException(amount + " cannot dedected from available balance " + this.balance);
		this.balance -= amount;
	}

	@Override
	public double getBalance() throws InvalidInputException {
		return balance;
	}

}
