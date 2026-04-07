import java.util.Locale;
import java.util.Scanner;

public class exrepfor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		
		System.out.println("Quantos numeros deseja inserir ?");
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i<N; i++) {
			System.out.print("Insira um numero: ");
			int x = sc.nextInt();
			soma += x;
		}		
		
		System.out.printf("Soma: %d", soma);
		
		
		sc.close();
	}

}
