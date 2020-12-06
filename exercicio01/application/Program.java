package exercicio01.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio01.entities.Rectangle;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.err.println();
        System.out.println(rectangle);

        sc.close();
        
    }
    
}
