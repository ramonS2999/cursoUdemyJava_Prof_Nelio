package exercicio11.app;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import exercicio11.model.exceptions.DomainException;
import exercicio11.model.entities.Account;


public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        // Criando um objeto do tipo conta.
        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.print("Enter amount for withdraw: ");

        try {
            account.withdraw(sc.nextDouble());
    
            System.out.println(account);
        }
        catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        
        sc.close();
        
    }
}
