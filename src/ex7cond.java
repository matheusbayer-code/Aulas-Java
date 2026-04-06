import java.util.Locale;
import java.util.Scanner;

public class ex7cond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		double x,y;
		
		System.out.println("Digite valor de X");
		x = sc.nextDouble();
		System.out.println("Digite o valor de Y");
		y = sc.nextDouble();
		
		if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else if (x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		}
		else if (x == 0.0 && y == 0.0) {
			System.out.println("ORIGEM");
		}
		else if (x != 0.0 && y == 0) {
			System.out.println("Eixo X");
		}
		else {
			System.out.println("Eixo Y");
		}
		
		
		sc.close();
	}

}
