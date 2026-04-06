import java.util.Scanner;

public class ex1seq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		
		System.out.println("Digite primeiro numero:");
		x = sc.nextInt();
		System.out.println("Digite segundo numero:");
		y = sc.nextInt();
		soma = x + y;
		
		System.out.printf("SOMA = %d", soma);
		
		
		sc.close();	
		
		
	}

}
