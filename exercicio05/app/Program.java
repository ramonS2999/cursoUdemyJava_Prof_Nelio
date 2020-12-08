package exercicio05.app;

import java.util.Locale;
import java.util.Scanner;

import exercicio05.entities.Hospedi;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int quantidade = sc.nextInt();

        Hospedi[] hotel = new Hospedi[10];

        for(int i = 0; i < quantidade; i++) {
            System.out.println();
            System.out.printf("Rent #%d%n:", (i + 1));

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();

            hotel[room] = new Hospedi(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < hotel.length; i++) {
            
            if(hotel[i] != null) {
                System.out.println(i + ": " + hotel[i]);
            }
        }
        System.out.println();

        sc.close();
        
    }
}
