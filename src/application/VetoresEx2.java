package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class VetoresEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		int n = sc.nextInt();
		Product2[] vect = new Product2[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product2(name,price);
		}
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum/vect.length;
		
		System.out.printf("AVARAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}

}
