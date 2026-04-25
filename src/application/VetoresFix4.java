package application;

import java.util.Locale;
import java.util.Scanner;

public class VetoresFix4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int [] vect = new int [n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES:");
		int count = 0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i]%2 == 0) {
				count++;
				System.out.print(vect[i] + " ");				
			}
		}
		System.out.println();
		System.out.print("QUANTIDADE DE PARES = " + count);
		
		sc.close();
	}

}
