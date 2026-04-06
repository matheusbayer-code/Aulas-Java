import java.util.Scanner;
import java.util.Locale;

void main() {
	
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	sc.useLocale(Locale.US);
	
	double x;
	
	x = sc.nextDouble();
	
	System.out.printf("Voce digitou: %.2f%n", x);
	
	
	sc.close();
}