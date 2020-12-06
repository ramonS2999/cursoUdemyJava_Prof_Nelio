package tarefa02.application;

import java.util.Locale;
import java.util.Scanner;

import tarefa02.util.Calculator;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double circumferencaVar = Calculator.circumference(radius);

        double volumeVar = Calculator.volume(radius);

        System.out.printf("Circunference: %.2f%n", circumferencaVar);
        System.out.printf("Volume: %.2f%n", volumeVar);
        System.out.printf("Circunference: %.2f%n", Calculator.PI);

        sc.close();
    }
}