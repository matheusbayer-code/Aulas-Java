import java.util.Locale;
import java.util.Scanner;
void main() {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in); 
	
	String nome = "Maria";
	int idade = 31;
	double renda = 4000.0;	
	double x;
	
	IO.print("Insira o valor de X:");
	x = sc.nextDouble();
	
	
	System.out.printf("Resultado = %.2f metros%n", x);
	System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	
	
	sc.close();	
}