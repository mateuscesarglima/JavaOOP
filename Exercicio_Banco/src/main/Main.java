package main;

import java.util.Locale;
import java.util.Scanner;

import entity.Account;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n)");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number,holder,initialDeposit);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println("Enter a withdraw value");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
	
		sc.close();
	}
}
