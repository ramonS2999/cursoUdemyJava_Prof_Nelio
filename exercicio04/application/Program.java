package exercicio04.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio04.entities.Account;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Is there na initial deposito (y/n)? ");
        char option = sc.next().charAt(0);
        
        double saldo;
        if(option == 'y') {
            System.out.print("Enter initial deposit value: ");
            saldo = sc.nextDouble();

            account = new Account(name, number, saldo);

        } else {
            account = new Account(name, number);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposito = sc.nextDouble();
        account.depositar(deposito);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        deposito = sc.nextDouble();
        account.saque(deposito);
        System.out.println("Updated account data: ");
        System.out.println(account);
        System.out.println();

        sc.close();
    }

}
