import java.util.Scanner;

public class ex2repfor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros serão digitados ?");
		int N = sc.nextInt();
		
		int in = 0;
		int out = 0;
		for (int i = 0; i < N; i++) {
			System.out.println("Insira um valor: ");
			int x = sc.nextInt();
			if (x >= 10 && x<= 20) {
				 in++;				
			}
			else {
				out++;
			}
		}
		
		System.out.printf("%d in%n", in);
		System.out.printf("%d out%n", out);
		
		sc.close();
	}

}
