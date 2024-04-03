package Project;

// inheritance: SavingsAccount class (subclass of Account) represents savings account
public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate, String customerName, String customerAddress, String customerPhoneNumber) {
        super(accountNumber, balance, customerName, customerAddress, customerPhoneNumber);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    public String toString() {
        return "Savings Account Number: " + getAccountNumber() + "\nBalance: " + getBalance();
    }
}
