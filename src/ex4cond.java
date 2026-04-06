import java.util.Locale;
import java.util.Scanner;

public class ex4cond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		int hinicial, hfinal, duracao;
		
		System.out.println("Insira a Hora inicial: ");
		hinicial = sc.nextInt();
		System.out.println("Insira a Hora final: ");
		hfinal = sc.nextInt();
		
		
		if (hinicial > 24 || hinicial <0 || hfinal > 24 || hfinal <0) {
			System.out.println("Valor invalido");			
		}
		else if (hfinal > hinicial) {
			duracao = hfinal - hinicial;
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		}
		else {
			duracao = (24 - hinicial) + hfinal;
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		}
		
			
		
		sc.close();
	}

}
