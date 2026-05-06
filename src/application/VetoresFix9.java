package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class VetoresFix9 {
	// inverti a ordem esse na verdade é o exercício 10

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		System.out.println("Quantos alunos serao digitadas?");
		int n = sc.nextInt();
		Alunos[] vect = new Alunos[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do "+ (i+1) +"o aluno: ");
			sc.nextLine();
			String name = sc.nextLine();
			double note1 = sc.nextDouble();
			double note2 = sc.nextDouble();
			vect[i] = new Alunos(name, note1, note2);
		}
		
		System.out.println("Alunos aprovados: ");
		for (int i=0; i<vect.length; i++) {
			if ((vect[i].getNote1()+vect[i].getNote2())/2 >= 6.0) {
				System.out.println(vect[i].getName());				
			}
		}
		
		
		sc.close();
	}

}
