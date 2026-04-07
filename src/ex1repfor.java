import java.util.Scanner;

public class ex1repfor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira valor de x: ");
		int x = sc.nextInt();
		
		for (int i = 0; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}	
		}
				
		sc.close();
	}

}
