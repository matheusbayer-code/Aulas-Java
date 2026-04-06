import java.util.Locale;
import java.util.Scanner;

public class ex5cond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		int cod, qntd;
		double total;
		
		System.out.println("Insira o codigo: ");
		cod = sc.nextInt();
		System.out.println("Insira a Quantidade: ");
		qntd = sc.nextInt();
		
		if (cod == 1) {
			total = qntd * 4.00;
			System.out.printf("TOTAL: R$ %.2f%n", total);
		}
		else if (cod == 2) {
			total = qntd * 4.50;
			System.out.printf("TOTAL: R$ %.2f%n", total);
		}
		else if (cod == 3) {
			total = qntd * 5.00;
			System.out.printf("TOTAL: R$ %.2f%n", total);
		}
		else if (cod == 4) {
			total = qntd * 2.00;
			System.out.printf("TOTAL: R$ %.2f%n", total);
		}
		else if (cod == 5) {
			total = qntd * 1.50;
			System.out.printf("TOTAL: R$ %.2f%n", total);
		}
		else {
			System.out.println("Codigo não cadastrado");
		}
		

		
		sc.close();
	}

}
