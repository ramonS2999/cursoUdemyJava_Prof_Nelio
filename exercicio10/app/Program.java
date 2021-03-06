package exercicio10.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exercicio10.model.entities.Resevation;
import exercicio10.model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Roon number: ");
        int number = sc.nextInt();

        try {
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
    
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());
        
            Resevation resevation = new Resevation(number, checkIn, checkOut);
            System.out.println("Resevation: " + resevation);
    
            System.out.println();
            System.out.println("Enter data to upadate the resevation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());
            
            resevation.updateDates(checkIn, checkOut);
            System.out.println("Resevation: " + resevation);                
            
        } 
        catch (ParseException e) {
            System.out.println("Invalide date fromat");
        }
        catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();

    }
}
