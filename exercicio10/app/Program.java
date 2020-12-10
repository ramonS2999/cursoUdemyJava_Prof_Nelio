package exercicio10.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exercicio10.model.entities.Resevation;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Roon number: ");
        int number = sc.nextInt();

        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());

        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in resevation: Check-out date must be after check-in date");
        } else {
            Resevation resevation = new Resevation(number, checkIn, checkOut);
            System.out.println("Resevation: " + resevation);

            System.out.println();
            System.out.println("Enter data to upadate the resevation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());
            
            String error = resevation.updateDates(checkIn, checkOut);
            if (error != null) {
                System.out.println("Error in resevation: " + error);
            }
            else {
                System.out.println("Resevation: " + resevation);                
            }

        }

        sc.close();

    }
}
