package tarefa10.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import tarefa10.entities.Circle;
import tarefa10.entities.Rectangle;
import tarefa10.entities.Shape;
import tarefa10.entities.enums.Color;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> listShape = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if(ch == 'r') {
                System.out.print("Widht: ");
                double widht =sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();
                
                listShape.add(new Rectangle(color, widht, height));

            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                listShape.add(new Circle(color, radius));
            }
        }

        System.out.println("SHAPE AREAS:");
        for (Shape c : listShape) {
            System.out.println(c);
        }

        sc.close();
    }
}
