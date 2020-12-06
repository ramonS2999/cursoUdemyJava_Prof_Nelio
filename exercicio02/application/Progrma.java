package exercicio02.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio02.entities.Employee;


public class Progrma {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());

        System.out.println();
        System.out.println("Updaded data: " + employee);
        System.out.println();

        sc.close();
    }
}
