import java.util.Locale;
import java.util.Scanner;

public class ex3repfor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		System.out.print("Quantos casos serão digitados ?");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			a*=2.0;
			b*=3.0;
			c*=5.0;
			double media = (a+b+c)/10;
			System.out.printf("%.1f%n", media);
		}
		sc.close();
	}

}
