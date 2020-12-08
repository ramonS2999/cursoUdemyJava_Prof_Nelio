package exercicio09.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio09.entities.Company;
import exercicio09.entities.Individual;
import exercicio09.entities.People;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<People> listPeople = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {

            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
    
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                listPeople.add(new Individual(name, anualIncome, healthExpenditures));

            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                listPeople.add(new Company(name, anualIncome, numberOfEmployees));
                
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double total = 0.0;
        for (People people : listPeople) {
            System.out.print(people);
            total += people.taxPayer();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + total);

        sc.close();
    }
}
