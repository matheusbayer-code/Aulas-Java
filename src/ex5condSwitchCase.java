import java.util.Locale;
import java.util.Scanner;

public class ex5condSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		int cod, qntd;
		double total = 0;
		
		System.out.println("Insira o codigo: ");
		cod = sc.nextInt();
		System.out.println("Insira a Quantidade: ");
		qntd = sc.nextInt();
		
		switch (cod) {
		case 1:
			total = qntd * 4.00;
			break;
		case 2:
			total = qntd * 4.50;
			break;
		case 3:
			total = qntd * 5.00;
			break;
		case 4:
			total = qntd * 2.00;
			break;
		case 5:
			total = qntd * 1.50;
			break;
		default:
			System.out.println("Codigo não cadastrado");
			break;
		}
		
		System.out.printf("TOTAL: R$ %.2f%n", total);

		
		sc.close();
	}

}
