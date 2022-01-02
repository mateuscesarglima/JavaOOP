package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String clientName = sc.nextLine();

		System.out.print("Email: ");
		String clientEmail = sc.nextLine();

		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		sc.nextLine();
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(clientName, clientEmail, birthDate));

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Enter #" + i + " data: ");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			sc.nextLine();
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, new Product(productName, productPrice));
			
			order.addItem(orderItem);
			
		}
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);

	
		
		
	}

}
