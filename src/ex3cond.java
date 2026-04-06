import java.util.Locale;
import java.util.Scanner;

public class ex3cond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		int x, y;
		
		System.out.println("insira dois numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0) {
			System.out.println("São Multiplos");
			}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
		}

}
