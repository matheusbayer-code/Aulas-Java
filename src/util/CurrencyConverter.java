package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	public static double reais (double dolarPrice, double qntDolars) {
		return dolarPrice * qntDolars * (1.0+IOF);
	}

}
