package application;

import java.util.Scanner;
import entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter the product data: ");
		
		System.out.println("Product Name: ");
		product.name = scanner.nextLine();
		
		System.out.println("Product price: ");
		product.price = scanner.nextDouble();
		
		System.out.println("Product quantity: ");
		product.quantity = scanner.nextInt();
		System.out.println();
		
		//calls the toString() method in the Product class
		System.out.println("Product Data: " + product);
		
		System.out.println("Enter how many products should be added to stock");
		int quantity_added = scanner.nextInt();
		
		product.addProducts(quantity_added);
		
		System.out.println("Updated data: " + product);
		
		System.out.println("Enter how many products should be removed to stock");
		int quantity_removed = scanner.nextInt();
		product.removeProducts(quantity_removed);
		
		System.out.println("Updated data: " + product);
		
		scanner.close();

	}

}
