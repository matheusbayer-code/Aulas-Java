import java.util.Locale;
import java.util.Scanner;

public class ex2cond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		int x;
		
		System.out.println("insira um numero: ");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
			
		sc.close();
	}

}
