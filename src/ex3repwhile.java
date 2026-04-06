import java.util.Scanner;

public class ex3repwhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool=0, gasolina=0, diesel=0;
		
		System.out.println("Digite o codigo do produto: ");
		int cod = sc.nextInt();
		
		
		while (cod != 4) {
			if (cod == 1) {
				alcool ++;			
			}
			else if (cod == 2) {
				gasolina ++;
			}
			else if (cod == 3) {
				diesel ++;
			}
			System.out.println("Digite o codigo do produto: ");
			cod = sc.nextInt();
		}
		System.out.println("Muito Obrigado");
		System.out.printf("Alcool : %d%n", alcool);
		System.out.printf("Gasolina : %d%n", gasolina);
		System.out.printf("Diesel : %d%n", diesel);

		sc.close();
	}

}
