import java.util.Locale;
import java.util.Scanner;

import entity.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product p = new Product();
		
		
		System.out.println("Enter product data: \n ");

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		Product product = new Product(name, price);

		System.out.printf("Product data: %s. $ %.2f, %d units, Total: %.2f%n", product.name, product.price,
				product.quantity, product.totalValueInStock());

		System.out.print("Enter the number of products to be added in stock: ");
		product.addPRoducts(sc.nextInt());

		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: %.2f%n", product.name, product.price,
				product.quantity, product.totalValueInStock());

		System.out.print("Enter the number of products to be removed in stock: ");
		product.removeProducts(sc.nextInt());

		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: %.2f%n", product.name, product.price,
				product.quantity, product.totalValueInStock());

	} 

}
