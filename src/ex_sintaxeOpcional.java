import java.util.Locale;
import java.util.Scanner;

public class ex_sintaxeOpcional {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		int minutos = sc.nextInt();
		
		double conta = 50.00;
		if (minutos > 100) {
			conta += (minutos-100) * 2.0; // atribuição cumulativa
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		
		sc.close();
	}

}
