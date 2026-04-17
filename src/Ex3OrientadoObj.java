import java.util.Locale;
import java.util.Scanner;

import entities.Grade;

public class Ex3OrientadoObj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		Grade grade = new Grade();
		
		grade.name = sc.nextLine();
		grade.note1 = sc.nextDouble();
		grade.note2 = sc.nextDouble();
		grade.note3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", grade.finalNote()));
		
		if (grade.finalNote() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", grade.missingNote());
		}
		else {
			System.out.println("PASS");
		}
		
		
		sc.close();
	}

}
