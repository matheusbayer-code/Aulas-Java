import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ExFixacaoConstrutores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		Account account;
				
			
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accHolder = sc.nextLine();		
		System.out.print("Is there na initial deposit (y/n)? ");
		char confirmation = sc.next().charAt(0);
		if (confirmation == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accNumber, accHolder, initialDeposit);
		}
		else {
			account = new Account(accNumber, accHolder);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		
		sc.close();
		
	}

}
