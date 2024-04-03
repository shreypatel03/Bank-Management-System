package Project;

import java.util.ArrayList;

// account class (base class) represents bank account
public class Account {
    private String accountNumber;
    private double balance;
    private Customer customer; // composition: account is "part-of" customer
    private ArrayList<Transaction> transactions;

    public Account(String accountNumber, double balance, String customerName, String customerAddress, String customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = new Customer(customerName, customerAddress, customerPhoneNumber);
        this.transactions = new ArrayList<>();
    }

    // to get account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // to get account balance
    public double getBalance() {
        return balance;
    }

    // to get associated customer
    public Customer getCustomer() {
        return customer;
    }

    // to deposit money into account
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount, "Today"));
    }

    // to withdraw money from account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount, "Today"));
        } 
        
        else {
            System.out.println("Insufficient balance");
        }
    }

    // to display transaction history of account
    public void displayTransactionHistory() {
        System.out.println("\nTransaction history for account number " + accountNumber + ":");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public String toString() {
        return "Account Number: " + accountNumber + "\nBalance: " + balance;
    }
}
