import java.util.Locale;
import java.util.Scanner;
public class ex3seq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		
		int A, B, C, D, diferenca;
		
		System.out.println("insira 4 valores: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = A * B - C * D;
		
		System.out.printf("DIFERENCA = %d", diferenca);
		
		
		
		sc.close();
	}
}
