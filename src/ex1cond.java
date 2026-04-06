import java.util.Locale;
import java.util.Scanner;

public class ex1cond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		int X;
		
		System.out.println("insira um numero: ");
		X = sc.nextInt();
		
		if (X < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Não Negativo");
		}
	
		
		sc.close();
	}

}
