package programsproject;

	class BankAccount {
	    private String accountNumber;
	    private double balance;
	    
	    public BankAccount(String accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }
	    
	    public String getAccountNumber() {
	        return accountNumber;
	    }
	    
	    public double getBalance() {
	        return balance;
	    }
	    
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }
	    
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: $" + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }
	}

	class SavingsAccount extends BankAccount {
	    private double interestRate;
	    
	    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
	        super(accountNumber, initialBalance);
	        this.interestRate = interestRate;
	    }
	    
	    public double calculateInterest() {
	        return getBalance() * interestRate / 100;
	    }
	}



	public class EncapsulationInheritance {
	    public static void main(String[] args) {
	        SavingsAccount savingsAccount = new SavingsAccount("12345", 1000, 5);
	        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
	        System.out.println("Initial Balance: $" + savingsAccount.getBalance());
	        
	        savingsAccount.deposit(500);
	        savingsAccount.withdraw(200);
	        
	        System.out.println("Updated Balance: $" + savingsAccount.getBalance());
	        System.out.println("Calculated Interest: $" + savingsAccount.calculateInterest());
	    }
	}


