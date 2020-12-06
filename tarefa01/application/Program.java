package tarefa01.application;

import java.util.Locale;
import java.util.Scanner;

import tarefa01.entities.Product;

public class Program {
    public static void main(String[] args) {
        
        /**
         * Istanciando as Class que serão usadas no codigo.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: "); // Nome do poduto
        product.name = sc.nextLine(); // Pegando o nome do produto

        System.out.print("Price: " ); // Preço
        product.price = sc.nextDouble(); // Pegando o preço

        System.out.print("Quantity in stock: "); // Quantidade
        product.quantity = sc.nextInt(); // Pegando a quantidade

        System.out.println(); // saltando linha
        System.out.println("Product data: " + product); // Mostrando o produto

        System.out.println(); // saltando linha
        System.out.print("Enter the number of products to be added in stock: "); //Entrando com a quantidade no stock.
        int quantity = sc.nextInt(); // Pegando a quantidade
        product.addProducts(quantity); // Colocando no Objeto PRODUCT

        System.out.println(); // saltando linha
        System.out.println("Updated data: " + product); // Mostrando o produto

        System.out.println(); // saltando linha
        System.out.print("Enter the number of products to be removed from stock: "); //Removendo a quantidade no stock.
        quantity = sc.nextInt(); // Pegando a quantidade pra ser removida
        product.removeProducts(quantity); // passando para Objeto PRODUCT

        System.out.println(); // saltando linha
        System.out.println("Updated data: " + product); // Mostrando o produto

        sc.close();
    }
    
}
