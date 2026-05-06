package application;

import java.util.Locale;
import java.util.Scanner;

public class VetoresFix7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		System.out.print("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();
		
		double [] vect = new double [n];
		double soma = 0;
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		double media = soma/n;
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}		
		
		
		sc.close();
	}

}
