import java.util.Locale;
import java.util.Scanner;

public class ex4seq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
			
		
		int cod, horas;
		double salarioH, salarioT;
		
		System.out.println("Insira o codigo do funcionário: ");
		cod = sc.nextInt();
		System.out.println("Quantas horas o funcionario trabalhou ?");
		horas = sc.nextInt();
		System.out.println("Qual valor da hora trabalhada ?");
		salarioH = sc.nextDouble();
		
		salarioT = horas * salarioH;
		
		System.out.printf("Number = %d%n", cod);
		System.out.printf("SALARY = U$ %.2f%n", salarioT);
		
		
		
		sc.close();
	}

}
