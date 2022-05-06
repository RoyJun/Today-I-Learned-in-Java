package practice;

public class Account1 {
	String accountNum;
	String owner;
	int balance;
	
	public Account1(String accountNum, String owner, int balance) {
		
	}
	
	int deposit(int balance) {
		this.balance+=balance;
		return this.balance;
	}
	
	int withdrawal(int withdrawal) {
		this.balance-=withdrawal;
		return balance;
		
	}
}
