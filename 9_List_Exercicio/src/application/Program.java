package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.Position;

import entity.Employees;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered?: ");
		int n = sc.nextInt();

		List<Employees> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			System.out.println("\nEmployee #" + (i + 1));
			System.out.print("Enter your id: ");
			Integer id = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter your name: ");
			String name = sc.nextLine();

			System.out.print("Enter your salary: ");
			Double salary = sc.nextDouble();

			Employees em = new Employees(id, name, salary);

			list.add(em);

		}

		System.out.printf("Enter the employee id that will have salary increase : ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		if (pos == null) {
			System.out.println("This id does not exist!");
		}else {
			
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).insertion(percent);
			
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		
		for(Employees em : list) {
			System.out.println(em.getId() + ", " + em.getName() + ", " + em.getSalary());
		}

		sc.close();

	}

	public static Integer position(List<Employees> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
