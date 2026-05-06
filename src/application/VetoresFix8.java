package application;

import java.util.Locale;
import java.util.Scanner;

public class VetoresFix8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n =sc.nextInt();
		int [] vect = new int [n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		double soma=0;
		double divpares=0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i]%2==0) {
				soma+=vect[i];
				divpares++;
			}
		}

		
		if (divpares == 0) {
			System.out.println("NENHUM NUMERO PAR ");
		}
			else {
				double media = soma/divpares;
				System.out.printf("MEDIA DOS PARES = %.1f%n", media);
			}
				
		
		sc.close();
	}

}
