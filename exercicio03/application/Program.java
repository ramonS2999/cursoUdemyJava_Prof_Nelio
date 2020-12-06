package exercicio03.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio03.entities.Aluno;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        aluno.name = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.println();
        System.out.println(aluno);
        System.out.println();

        sc.close();
    }
    
}
