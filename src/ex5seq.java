import java.util.Locale;
import java.util.Scanner;

public class ex5seq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		int cod1, cod2, qnt1, qnt2;
		double valor1, valor2, total;
		
		System.out.print("Insira o codigo: ");
		cod1 = sc.nextInt();
		System.out.print("Insira a quantidade: ");
		qnt1 = sc.nextInt();
		System.out.print("Insira o valor: ");
		valor1 = sc.nextDouble();
		
		System.out.print("Insira o codigo: ");
		cod2 = sc.nextInt();
		System.out.print("Insira a quantidade: ");
		qnt2 = sc.nextInt();
		System.out.print("Insira o valor: ");
		valor2 = sc.nextDouble();
		System.out.println();
		
		total = qnt1 * valor1 + qnt2 * valor2;
		
		System.out.printf("Valor a pagar : R$ %.2f%n", total);
		
				
		sc.close();
	}

}
