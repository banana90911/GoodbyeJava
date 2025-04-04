package ch06.sec15;

public class Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	static int cnt = 0;
	String accountNum = "";
	String accountName = "";
	int balance = 0;

	Account(String accountNum, String accountName, int accountAmount) {
		this.accountNum = accountNum;
		this.accountName = accountName;
		this.balance = accountAmount;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	public String getAccountName() {
		return this.accountName;
	}
	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		if (balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			return;
		}
		this.balance = balance;
	}
}
