package exercicio06.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio06.entities.Employee;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employee = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int quantidade = sc.nextInt();
        System.out.println();

        for (int i = 0; i < quantidade; i++) {

            System.out.printf("Employee #%d: %n", (i + 1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();

            employee.add(i, new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        Integer id = sc.nextInt();

        boolean testFalso = false;
        for (int j = 0; j < employee.size(); j++) {

            if (employee.get(j).getId().equals(id)) {
                System.out.print("Enter the percentage: ");
                Double porcentagem = sc.nextDouble();
                employee.get(j).almentoDeSlaarioPorcentagem(porcentagem);
                testFalso = true;
            }
        }

        System.out.println((testFalso) ? " " : "This id not exist!");

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee x : employee) {
            System.out.println(x);
        }

        sc.close();

    }

}
