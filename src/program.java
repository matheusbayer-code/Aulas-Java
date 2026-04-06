import java.util.Locale;
import java.util.Scanner;

void main() {
	
	Scanner sc = new Scanner(System.in); 
	sc.useLocale(Locale.US);
	Locale.setDefault(Locale.US);
	
	int N;
	double media, soma;
	
	IO.print("Quantos numeros você vai digitar ?");
	N = sc.nextInt();
	
	double[] vet = new double[N];
	for (int i=0; i < N; i++) {
		IO.print("Digite um Numero: ");
		vet[i] = sc.nextDouble();
	}
	
	soma = 0;
	
	for (int i=0; i < N; i++) {
		soma = soma + vet[i];
	}
	media = soma / N;
	
	IO.print("VALORES = ");
	
	for (int i=0; i < N; i++) {
		IO.print(" " + String.format("%.2f", vet[i]) + " ");
	}
	
	IO.println();
	

	IO.println("Soma = " + String.format("%.2f", soma));
	

	IO.println("Media = " + String.format("%.2f", media));
	
	
	sc.close();
}