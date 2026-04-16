import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Ex2OrientacaoObj {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		
		
		
		sc.close();
	}

}
