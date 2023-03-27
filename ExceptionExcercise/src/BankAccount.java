import java.util.Scanner;

public class BankAccount {
	private int accNo;
	private String custName;
	private String accType;
	private float balance;
	
	public BankAccount(int accNo, String custName, String accType, float balance) {
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}
	
	public int getAccNo() {
		return accNo;
	}



	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}



	public String getCustName() {
		return custName;
	}



	public void setCustName(String custName) {
		this.custName = custName;
	}



	public String getAccType() {
		return accType;
	}



	public void setAccType(String accType) {
		this.accType = accType;
	}



	public float getBalance() throws LowBalanceException{
		if(this.accType.equalsIgnoreCase("Savings")) {
			if(this.balance < 1000f) {
				throw new LowBalanceException("Balance too low");
			}
			else {
				return this.balance;
			}
		}
		else {
			if(this.getBalance() < 5000f) {
				throw new LowBalanceException("Balance too low ");
			}
			else {
				return this.balance;
			}
		}
	}



	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void deposit(float amt) throws NegativeAmountException{
		if(amt < 0) {
			throw new NegativeAmountException("Deposit is negative ");
		}
		else {
			this.balance+=amt; 
		} 
	}
	
	public void withdraw(float amt) throws NegativeAmountException, LowBalanceException{
		if(amt < 0) {
			throw new NegativeAmountException("Deposit is negative ");
		}
		else if(this.accType.equalsIgnoreCase("Savings")) {
			if(this.getBalance()-amt < 1000) {
				throw new LowBalanceException("Balance is too low ");
			}
			else {
				this.balance-=amt;
			}
		}
		else if(this.accType.equalsIgnoreCase("Current")) {
			if(this.getBalance()-amt < 5000) {
				throw new LowBalanceException("Balance is too low ");
			}
			else {
				this.balance-=amt;
			}
		}
	}
	



	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter bank account info ");
		
		System.out.println("Account Number: ");
		int accNum = in.nextInt();
		System.out.println("Account Name: ");
		String accName = in.next();
		System.out.println("Account type (Savings or Current)");
		String accType = in.next();
		System.out.println("Intial balance");
		float initialBal = in.nextFloat();
		
		
		
		BankAccount b = new BankAccount(accNum, accName, accType, initialBal);
		
		try {
			System.out.println(b.getBalance());
			b.withdraw(1000);
			System.out.println(b.getBalance());
			b.deposit(5000);
			System.out.println(b.getBalance());
		}
		catch(LowBalanceException e) {
			System.out.println("Balance is too low for account type");
		}
		catch(NegativeAmountException e) {
			System.out.println("negative amounts not allowed");
		}

	}

}
