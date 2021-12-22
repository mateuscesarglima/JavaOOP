

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee em = new Employee();
        
        System.out.print("Name: ");
        em.name = sc.nextLine();
        System.out.print("Gross salary: ");
        em.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        em.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n", em.name, em.netSalary());

        System.out.print("Which percentage to increase salary? ");
        em.increaseSalary(sc.nextDouble());

        System.out.printf("Updated data: %s, $ %.2f%n", em.name, em.netSalary());

        


        sc.close();
        
        




    }
}
