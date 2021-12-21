package application;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio1 {
    
    public static void main(String[] args) {

        /* Fazer um programa para ler os valores da largura e altura de um retângulo.
        Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. */ 

        // Class Rectangle utilizada.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle r = new Rectangle();

        System.out.println("Enter rectangle data");

        System.out.print("Width: ");
        r.width = sc.nextDouble();
        System.out.print("Height: ");
        r.height = sc.nextDouble();

        System.out.printf("\n\nAREA =  %.2f\nPERIMETER = %.2f\nDIAGONAL = %.2f \n\n", r.area(), r.perimeter(), r.diagonal());

        sc.close();


    }

}
