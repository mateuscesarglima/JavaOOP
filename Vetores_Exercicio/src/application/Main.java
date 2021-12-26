package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Students;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Students[] vect = new Students[9];

		System.out.print("How many rooms will be rented: ");
		int qtd = sc.nextInt();

		for (int i = 0; i < qtd; i++) {

			System.out.println("Rent #" + (i + 1));
			sc.nextLine();
			System.out.print("Enter the student name: ");
			String name = sc.nextLine();

			System.out.print("Enter the student email: ");

			String email = sc.nextLine();

			System.out.print("enter the room what you want: ");
			int room = sc.nextInt();

			if (vect[room] != null) {
				System.out.print("busy room, inform another room number: ");
				sc.nextLine();
				room = sc.nextInt();
			}

			vect[room] = new Students(name, email);

		}

		/*
		 * for(int i = 0; i < 9; i++) { if(vect[i] != null) {
		 * System.out.println("Busy rooms: "); System.out.println(i +": "+
		 * vect[i].getName() + ", " + vect[i].getEmail()); }
		 */

		System.out.println("\n Busy Rooms: ");
		for (int i = 0; i < 9; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i].getName() + ", " + vect[i].getEmail());
			}
		}
		
		System.out.println("\n Free rooms: ");
		for (int i = 0; i < 9; i++) {
			if(vect[i] == null) {
				System.out.println("-> " + i);
			}
		}
	}

}
