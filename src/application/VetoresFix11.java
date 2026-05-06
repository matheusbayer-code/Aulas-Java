package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class VetoresFix11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoa [] vect = new Pessoa[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Altura da "+ (i+1) +"a pessoa: ");
			double height = sc.nextDouble();
			System.out.print("Genero da "+ (i+1) +"a pessoa: ");
			char gender =sc.next().charAt(0);
			vect [i] = new Pessoa(height, gender);		
		}
		
		System.out.printf("Menor altura = %.2f%n", Pessoa.menorAltura(vect));
		System.out.printf("Maior altura = %.2f%n", Pessoa.maiorAltura(vect));
		System.out.printf("Media das alturas das mulheres = %.2f%n", Pessoa.mediaFeminina(vect));
		System.out.printf("Numero de homens = %d", Pessoa.contarHomens(vect));
		
		sc.close();
	}
	

}
