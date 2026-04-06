import java.util.Locale;
import java.util.Scanner;

public class ex2seq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		double area, raio, pi=3.14159;
		
		System.out.println("Insira o valor do raio: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2.0);
		
		System.out.printf("Area = %.4f%n", area);
		
		
		
		sc.close();

	}

}
