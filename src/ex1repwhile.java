import java.util.Scanner;
public class ex1repwhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Insira a senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
	}

}
