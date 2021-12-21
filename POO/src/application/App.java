package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class App {
    public static void main(String[] args) throws Exception {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Informe o valor dos lados do triangulo X ");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Informe o valor dos lados do Triangulo Y ");

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) + (p - x.c));

        System.out.println(areaX);
        System.out.println(areaY);

        if(areaX > areaY) {
            System.out.println("Larger area: " + areaX);
        }else{
            System.out.println("Larger area: " + areaY);
        }

        


        /*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangule X: ");

        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangule Y: ");

        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));


        System.out.println(areaX);
        System.out.println(areaY);

        if(areaX > areaY) {
            System.out.println("A maior area é do triangulo X");
        }else{
            System.out.println("A maior área é do triangulo Y");
        }

        */

    }
}
