import java.util.Scanner;

public class ex2repwhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Insira valor de X:");
		int x = sc.nextInt();
		System.out.println("Insira valor de Y:");
		int y = sc.nextInt();

		
		while (x != 0 && y != 0) {
			if (x > 0.0 && y > 0.0) {
				System.out.println("Q1");
			}
			else if (x < 0.0 && y > 0.0) {
				System.out.println("Q2");
			}
			else if (x < 0.0 && y < 0.0) {
				System.out.println("Q3");
			}
			else {
				System.out.println("Q4");
			}
			System.out.println("Insira valor de X:");
			x = sc.nextInt();
			System.out.println("Insira valor de Y:");
			y = sc.nextInt();

		}

		sc.close();
	}
}
