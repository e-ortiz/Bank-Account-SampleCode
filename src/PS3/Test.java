package PS3;

public class Test {
	
	public static void main(String[] args) throws InsufficientFundsException{
		Account test = new Account();
		test.setID(1122);
		test.setBalance(20000);
		test.setAnnualInterestRate(.45);
		
		test.withdraw(2500);
		test.deposit(3000);
		
	
		System.out.println(test.getBalance());
		System.out.println(test.getMonthlyInterestRate());
		System.out.println(test.getDate());
		test.withdraw(30000);
	}

}
