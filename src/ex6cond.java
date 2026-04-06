import java.util.Locale;
import java.util.Scanner;

public class ex6cond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		double x;
		
		System.out.println("Insira um valor: ");
		x = sc.nextDouble();
		
		if (x >= 0 && x <= 25.00) {
			System.out.println("Intervalo [0,25]");
		}
		else if (x > 25.00 && x <= 50.00) {
			System.out.println("Intervalo [25,50]");
		}
		else if (x > 50.00 && x <= 75.00) {
			System.out.println("Intervalo [50,75]");
		}
		else if (x > 75.00 && x <= 100.00) {
			System.out.println("Intervalo [75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		
		
		sc.close();
	}

}
