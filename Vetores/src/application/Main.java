package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Product;

public class Main {

	public static void main(String[] args) {
		/* Fazer um programa par aler um número inteiro N e a altura de N pessoas.
		Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("informe a quantidade de produtos: ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for( int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Informe o nome do produto: ");
			String name = sc.nextLine();
			System.out.println("Informe o preço do produto: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name,price);
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < n ; i++) {
			
			sum += vect[i].getPrice();
			
		}
		
		double avg = sum / n;
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Name: " + vect[i].getName());
			System.out.println("Price: " + vect[i].getPrice() + "\n\n");
			
		}
		
		System.out.println("AVERAGE PRICE = " + avg);
		
		sc.close();

	}

}
