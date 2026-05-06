package entities;

public class Pessoa {
	private double height;
	private char gender;
	
	public Pessoa(double height, char gender) {
		this.height = height;
		this.gender = gender;
	}


	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
    public static double menorAltura(Pessoa[] vect) {
        double menor = vect[0].getHeight();
        for (Pessoa p : vect) {
            if (p.getHeight() < menor) 
            	menor = p.getHeight();
        }
        return menor;
    }

    public static double maiorAltura(Pessoa[] vect) {
        double maior = vect[0].getHeight();
        for (Pessoa p : vect) {
            if (p.getHeight() > maior) 
            	maior = p.getHeight();
        }
        return maior;
    }

    public static double mediaFeminina(Pessoa[] vect) {
        double soma = 0;
        int count = 0;
        for (Pessoa p : vect) {
            if (p.getGender() == 'F') {
                soma += p.getHeight();
                count++;
            }
        }
        if (count > 0) {
            return soma / count;
        } else {
            return 0;
        }
    }

    public static int contarHomens(Pessoa[] vect) {
        int count = 0;
        for (Pessoa p : vect) {
            if (p.getGender() == 'M') count++;
        }
        return count;
    }
	
		
}
