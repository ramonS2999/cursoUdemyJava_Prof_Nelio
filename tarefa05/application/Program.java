package tarefa05.application;

import java.util.Locale;
import java.util.Scanner;

import tarefa05.entities.Matrix;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Matrix position;

        Integer linha = sc.nextInt();
        Integer coluna = sc.nextInt();

        Integer[][] matrix = new Integer[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Integer valor = sc.nextInt();

       for (int i = 0; i < linha; i++) {
           for (int j = 0; j < coluna; j++) {
               
            if(valor == matrix[i][j]) {
                position = new Matrix(i, j);

                System.out.printf("Position %d, %d %n", i, j);

                System.out.print((position.findLeft(matrix) != null) ? "Left: " + position.findLeft(matrix) + "\n" : ""); 
                System.out.print((position.findRight(matrix) != null) ? "Right: " + position.findRight(matrix) + "\n" : "");
                System.out.print((position.findUp(matrix) != null) ? "Up: " + position.findUp(matrix) + "\n" : ""); 
                System.out.print((position.findDown(matrix) != null) ? "Down: " + position.findDown(matrix) + "\n" : ""); 
                
            }
           }
       }

        sc.close();
        
    }
    
}
