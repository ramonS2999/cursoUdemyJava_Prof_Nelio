package exercicio07.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicio07.entities.Client;
import exercicio07.entities.Order;
import exercicio07.entities.OrderItem;
import exercicio07.entities.Product;
import exercicio07.entities.enem.OrderStatus;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cliente data:");
        System.out.print("Name:");
        String name = sc.nextLine();
        
        System.out.print("Email:");
        String email = sc.nextLine();

        System.out.print("Birth date: ");
        Date birthDate = sdf.parse(sc.nextLine());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        System.out.print("How many items to this order? ");
        int itemsQuantity = sc.nextInt();

        OrderItem item;
        Order order = new Order(status, client);

        for (int i = 1; i <= itemsQuantity; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String nameProduct  = sc.next();

            System.out.print("Product price: ");
            Double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            item = new OrderItem(quantity, new Product(nameProduct, price));

            order.addItem(item);
        }

        System.out.println();
        System.out.println(order);
        
        sc.close();
        
    }
    
}
