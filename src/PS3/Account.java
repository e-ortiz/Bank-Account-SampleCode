package PS3;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();

	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	// accessor and mutator id, balance, annualInterestRate

	public void setID(int ID) {
		this.id = ID;
	}

	public int getID() {
		return this.id;
	}

	public void setBalance(double Balance) {
		this.balance = Balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setAnnualInterestRate(double Interest) {
		this.annualInterestRate = Interest;
	}

	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}

	// date accessor
	public Date getDate() {
		return this.dateCreated;
	}

	// Monthly Interest Rate. Gets Yearly interest / 12.
	public double getMonthlyInterestRate() {
		return (this.annualInterestRate / 12);
	}

	// withdraw: takes amount out of account
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			setBalance(getBalance() - amount);
		} else {
			double needs = amount - balance;
		      System.out.println("Sorry, but you are short $"
                      + needs);
			throw new InsufficientFundsException(needs);
		}
	}

	// deposit
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	}

}
