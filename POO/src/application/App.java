package application;

import java.util.Locale;
import java.util.Scanner;


import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        // Scanner
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        sc.close();

        Product p = new Product();

        System.out.println("Enter product data: ");

        System.out.println("Name: ");
        p.name = sc.nextLine();

        System.out.println("Price: ");
        p.price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        p.quantity = sc.nextInt();

        

        System.out.printf("Product data: %s $ %.2f, %d units, Total: $ %.2f%n ", p.name, p.price, p.quantity, p.totalProductsInStock());


        System.out.println("Enter the number of product to be added in stock: ");
        p.addProducts(sc.nextInt());

        System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", p.name, p.price, p.quantity, p.totalProductsInStock());

        System.out.println("Enter the number of products to be removed from stock: ");
        p.removeProducts(sc.nextInt());

        System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", p.name, p.price, p.quantity, p.totalProductsInStock());


        // Utilizando o toString.
        System.out.println(p);
 
        


        /*
         * -----------------------------------------------------------------------------
         * --------------------
         * 
         * Locale.setDefault(Locale.US);
         * Scanner sc = new Scanner(System.in);
         * 
         * Triangle x = new Triangle();
         * Triangle y = new Triangle();
         * 
         * System.out.println("Informe o valor dos lados do triangulo X ");
         * 
         * x.a = sc.nextDouble();
         * x.b = sc.nextDouble();
         * x.c = sc.nextDouble();
         * 
         * System.out.println("Informe o valor dos lados do Triangulo Y ");
         * 
         * y.a = sc.nextDouble();
         * y.b = sc.nextDouble();
         * y.c = sc.nextDouble();
         * 
         * double areaX = x.area();
         * double areaY = y.area();
         * 
         * System.out.println("Triangule X area: " + areaX);
         * System.out.println("Triangule Y area: " + areaY);
         * 
         * if(areaX > areaY) {
         * System.out.println("Larger area: " + areaX);
         * }else{
         * System.out.println("Larger area: " + areaY);
         * }
         * 
         * -----------------------------------------------------------------------------
         * -------
         * 
         * Locale.setDefault(Locale.US);
         * Scanner sc = new Scanner(System.in);
         * 
         * 
         * double xA, xB, xC, yA, yB, yC;
         * 
         * System.out.println("Enter the measures of triangule X: ");
         * 
         * xA = sc.nextDouble();
         * xB = sc.nextDouble();
         * xC = sc.nextDouble();
         * 
         * System.out.println("Enter the measures of triangule Y: ");
         * 
         * yA = sc.nextDouble();
         * yB = sc.nextDouble();
         * yC = sc.nextDouble();
         * 
         * double p = (xA + xB + xC) / 2.0;
         * double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
         * 
         * p = (yA + yB + yC) / 2.0;
         * double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
         * 
         * 
         * System.out.println(areaX);
         * System.out.println(areaY);
         * 
         * if(areaX > areaY) {
         * System.out.println("A maior area é do triangulo X");
         * }else{
         * System.out.println("A maior área é do triangulo Y");
         * }
         * sc.close();
         * 
         * -----------------------------------------------------------------------------
         * --------------
         * 
         */

    }
}
