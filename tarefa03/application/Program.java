package tarefa03.application;

import java.util.Locale;
import java.util.Scanner;

import tarefa03.entities.CorrencyConverter;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        CorrencyConverter.dollar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        CorrencyConverter.value = sc.nextDouble();

        System.out.printf("Amoust to be paid in reais = %s%n", String.format("%.2f", CorrencyConverter.conversor()));

        sc.close();
    }
    
}
