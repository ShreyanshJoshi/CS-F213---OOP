public class Bank {
	private BankAccount[] accounts;
	static final int MAX_ACCOUNTS=15;
	private String name;
	private int no_of_accounts;

	public Bank(String name) {
		this.name = name;
		no_of_accounts =0;
		accounts = new BankAccount[MAX_ACCOUNTS];
	}

	public int createAccount() {
		if(no_of_accounts<MAX_ACCOUNTS) {
			accounts[no_of_accounts]= new BankAccount(no_of_accounts+1);
			no_of_accounts+=1;
			return 1;
		}
		else
			return 0;
	}
	public int createAccount(double balance) {
		if(no_of_accounts<MAX_ACCOUNTS) {
			accounts[no_of_accounts] = new BankAccount(no_of_accounts+1,balance);
			no_of_accounts+=1;
			return 1;
		}
		else
			return 0;
	}
	public int createAccount(String email) {
		if(no_of_accounts<MAX_ACCOUNTS) {
			accounts[no_of_accounts] = new BankAccount(no_of_accounts+1,email);
			no_of_accounts+=1;
			return 1;
		}
		else
			return 0;
	}
	public int createAccount(String email, double balance) {
		if(no_of_accounts<MAX_ACCOUNTS) {
			accounts[no_of_accounts] = new BankAccount(no_of_accounts+1,email,balance);
			no_of_accounts+=1;
			return 1;
		}
		else
			return 0;
	}
	public int getAccounts() {
		return no_of_accounts;
	}
	public int transaction(BankAccount b1,BankAccount b2,double amount) {
		if(amount<0)
			return -1;
		else if(b1.getBalance() - amount >1000.0 && b2.getBalance()+amount >1000.0) {
			b1.withdraw(amount);
			b2.deposit(amount);
			return 1;
		}
		else
			return 0;
	}
}
