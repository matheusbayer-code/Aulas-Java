package entities;

public class Account {
	private int accNumber;
	private String accHolder;
	private double balance;
	
	
	public Account(int accNumber, String accHolder) {
		this.accNumber = accNumber;
		this.accHolder = accHolder;
	}
	public Account(int accNumber, String accHolder, double initialDeposit) {
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		deposit(initialDeposit);
	}
	public int getAccNumber() {
		return accNumber;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public double getBalance() {
		return balance;
	}

	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount + 5.0;
	}
	public String toString() {
		return "Account "
				+accNumber
				+ ", Holder: "
				+accHolder
				+", Balance: $ "
				+String.format("%.2f", balance);
	}
	

}
