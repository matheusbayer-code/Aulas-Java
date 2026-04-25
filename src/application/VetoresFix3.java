package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alturas;

public class VetoresFix3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		System.out.println("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		Alturas[] vect = new Alturas[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.println("Dados da "+ (i+1) +"a pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			vect[i] = new Alturas(name, age, height);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum+= vect[i].getHeight();
		}
		double avg = sum/vect.length;
		System.out.printf("Altura média: %.2f%n", avg);
		
		double countLow = 0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getAge() < 16) {
				countLow++;
			}
		}
		double avgLow = countLow / vect.length*100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", avgLow);
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}		
				
		sc.close();
	}

}
