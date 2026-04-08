import java.util.Locale;
import java.util.Scanner;

public class problema_exdowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		char resp;
			
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double FR = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", FR);
			System.out.print("Deseja repetir ? (s/n) ");
			resp = sc.next().charAt(0);				
		} while (resp == 's');
		
		sc.close();
	}

}
