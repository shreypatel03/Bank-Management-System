package Project;

// inheritance: CurrentAccount class (subclass of Account) represents current account
public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit, String customerName, String customerAddress, String customerPhoneNumber) {
        super(accountNumber, balance, customerName, customerAddress, customerPhoneNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }

    public String toString() {
        return "Current Account Number: " + getAccountNumber() + "\nBalance: " + getBalance();
    }
}
