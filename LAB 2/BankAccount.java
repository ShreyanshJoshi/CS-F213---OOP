public class BankAccount {
	private int acc_no;
	private double balance;
	private String firstName;
	private String lastName;
	static final int MAX_TRANSACTIONS_DAY =5;
	static final double MIN_BALANCE = 1000.0;
	private int num_transactions;

	public BankAccount(int acc_no) {
		this.acc_no = acc_no;
		balance =MIN_BALANCE;
		firstName ="John";
		lastName = "Doe";
		lastName = lastName + acc_no;
		num_transactions =0;
	}

	public BankAccount(int acc_no,double balance) {
		this.acc_no = acc_no;
		this.balance = MIN_BALANCE+balance;
		firstName ="John";
		lastName = "Doe";
		lastName = lastName + acc_no;
		num_transactions= 0;
	}

	public BankAccount(int acc_no,String email) {
		this.acc_no = acc_no;
		balance = MIN_BALANCE;
		int i = email.indexOf('.');
		int j = email.indexOf('@');
		firstName = email.substring(0,i);
		firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);

		lastName = email.substring(i+1,j);
		lastName = lastName.substring(0,1).toUpperCase() +lastName.substring(1);
		num_transactions=0;
	}

	public BankAccount(int acc_no,String email,double balance) {
		this.acc_no = acc_no;
		this.balance = MIN_BALANCE + balance;
		int i = email.indexOf('.');
		int j = email.indexOf('@');
		firstName = email.substring(0,i);
		firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);

		lastName = email.substring(i+1,j);
		lastName = lastName.substring(0,1).toUpperCase() +lastName.substring(1);
		num_transactions=0;
	}
	public int getAccountNumber() {
		return acc_no;
	}
	public String getName() {
		String s = firstName+" "+lastName;
		return s;
	}
	public double getBalance() {
		return balance;
	}
	public int deposit(double amount) {
		if(amount>0) {
			if(num_transactions>MAX_TRANSACTIONS_DAY) {
				double x = amount*0.95;
				balance+=x;
				num_transactions+=1;
			}
			else {
				balance+=amount;
				num_transactions+=1;
			}
			return 1;
		}
		else
			return 0;
	}
	public int withdraw(double amount) {
		if(amount>0) {
			if(num_transactions>MAX_TRANSACTIONS_DAY && balance-1.05*amount >=MIN_BALANCE) {
				balance-=1.05*amount;
				num_transactions+=1;
				return 1;
			}

			else if(num_transactions<=MAX_TRANSACTIONS_DAY && balance-amount >=MIN_BALANCE) {
				balance-=amount;
				num_transactions+=1;
				return 1;
			}

			else
				return 0;
		}
		else
			return -1;
	}

	public void printDetails() {
		System.out.println("Acc No : " + acc_no);
		System.out.println("Name : " + firstName+" "+lastName);
		System.out.println("Balance : " + balance);
	}

}
