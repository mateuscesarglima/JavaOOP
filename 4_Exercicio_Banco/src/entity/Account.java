 package entity;

public class Account {

	private String holder;
	
	private int number;
	
	private double balance;
	
	public Account(int number, String holder, double balance) {
		this.holder = holder;
		this.number = number;
		this.deposit(balance);
	}
	
	public Account(int number,String holder) {
		this.holder = holder;
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public String toString() {
		return    "holder: " + holder + "\n" +
				  "number: " + number + "\n "+
				  "balance: " + balance;
	}
	
	
	
}
