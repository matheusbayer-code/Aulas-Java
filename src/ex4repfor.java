import java.util.Locale;
import java.util.Scanner;

public class ex4repfor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			if (y == 0) {
				System.out.println("Divisão Impossivel");
			}
			else {
				double resultado = x / y;
				System.out.printf("%.1f%n", resultado);
			}
		}
		
		sc.close();
	}

}
