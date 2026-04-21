import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ExFixacaoMemEstaticos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.print("What is the dollar price?");
		double dolarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought?");
		double qntDolars = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.reais(dolarPrice, qntDolars));
		
		sc.close();
	}

}
