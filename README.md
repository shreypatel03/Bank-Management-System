# Bank-Management-System

1. *Customer Class*:
    - This class represents bank customers and stores information such as name, address, and phone number.
    - It has a constructor to initialize customer details and an overridden toString() method to provide a string representation of the customer object.

2. *Bank Class*:
    - The Bank class represents a bank entity and manages accounts.
    - It contains a name for the bank and an ArrayList to store Account objects.
    - Methods include:
        - addAccount(Account account): Adds an account to the bank.
        - displayAllAccounts(): Displays all accounts in the bank along with associated customer information.
        - getAccount(String accountNumber): Retrieves an account based on the account number.
        - transferFunds(String fromAccountNumber, String toAccountNumber, double amount): Transfers funds between two accounts.
    
3. *Transaction Class*:
    - This class represents a bank transaction with attributes such as transaction type, amount, and date.
    - It has a constructor to initialize transaction details and an overridden toString() method to provide a string representation of the transaction object.

4. *Account Class*:
    - The Account class is a base class representing a bank account.
    - It contains attributes like account number, balance, associated customer, and a list of transactions.
    - Methods include:
        - deposit(double amount): Deposits money into the account.
        - withdraw(double amount): Withdraws money from the account.
        - displayTransactionHistory(): Displays transaction history for the account.
        - toString(): Provides a string representation of the account object.
    
5. *SavingsAccount Class*:
    - This class is a subclass of Account representing a savings account.
    - It includes an additional attribute for interest rate and a method applyInterest() to apply interest to the account.
    - Overrides the toString() method to provide a string representation of the savings account object.

6. *CurrentAccount Class*:
    - Another subclass of Account representing a current account.
    - It includes an additional attribute for overdraft limit and overrides the withdraw() method to check for overdraft limits.
    - Overrides the toString() method to provide a string representation of the current account object.

7. *BankManagementSystem Class*:
    - This is the main class for the bank management system.
    - It creates instances of Bank, Customer, SavingsAccount, and CurrentAccount.
    - Demonstrates various operations such as adding accounts, performing transactions, displaying account details, and transferring funds.
