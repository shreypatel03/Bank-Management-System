package Project;

import java.util.ArrayList;

// bank class represents a bank entity
public class Bank {
    private String name;
    private ArrayList<Account> accounts;

    // constructor to initialize bank name & accounts list
    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // to add account to bank
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // to display all accounts in bank
    public void displayAllAccounts() {
        System.out.println("\n\nAccounts in " + name + " bank:");
        for (Account account : accounts) {
            System.out.println("---------------------------------------");
            System.out.println(account);
            System.out.println("Customer Info:\n" + account.getCustomer());
        }
    }

    // to get account by account number
    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    // Method to transfer funds between accounts
    public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount) {
        Account fromAccount = getAccount(fromAccountNumber);
        Account toAccount = getAccount(toAccountNumber);

        if (fromAccount != null && toAccount != null) {
            if (fromAccount.getBalance() >= amount) {
                fromAccount.withdraw(amount);
                toAccount.deposit(amount);
                System.out.println("Transfer successful");
            } 
            
            else {
                System.out.println("Insufficient funds for transfer");
            }
        } 
        
        else {
            System.out.println("One or both accounts not found");
        }
    }
}
