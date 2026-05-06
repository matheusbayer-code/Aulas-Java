package application;

import java.util.Locale;
import java.util.Scanner;

public class VetoresFix10 {

	public static void main(String[] args) {
		// inverti a ordem esse é o exercicio 9
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String [] name = new String [n];
		int [] age = new int [n];
		
		for (int i=0; i<name.length; i++) {
			System.out.println("Dados da "+ (i+1) + "a pessoa: " );
			System.out.print("Nome: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
		}
		
		int older = age[0];
		String velho = name[0];
		for (int i=0; i<name.length; i++) {
			if (older < age[i]) {
				older = age[i];
				velho = name[i];
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + velho);
		
		
		sc.close();

	}

}
