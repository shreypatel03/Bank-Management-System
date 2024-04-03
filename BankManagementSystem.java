package Project;

// main class
public class BankManagementSystem {
    public static void main(String[] args) {
        // creating bank
        Bank bank = new Bank("SBI");

        // creating customers
        Customer customer1 = new Customer("Kiran Sharma", "Fort, Mumbai", "9832147878");
        Customer customer2 = new Customer("Karan Singh", "Civil Lines, Nagpur", "7829409287");

        // creating accounts for both
        SavingsAccount savingsAccount1 = new SavingsAccount("SA001", 1000, 0.05, "Kiran Sharma", "Fort, Mumbai", "9832147878");
        CurrentAccount currentAccount1 = new CurrentAccount("CA001", 2000, 1000, "Kiran Sharma", "Fort, Mumbai", "9832147878");

        SavingsAccount savingsAccount2 = new SavingsAccount("SA002", 500, 0.03, "Karan Singh", "Civil Lines, Nagpur", "7829409287");
        CurrentAccount currentAccount2 = new CurrentAccount("CA002", 1500, 500, "Karan Singh", "Civil Lines, Nagpur", "7829409287");

        // adding accounts to bank
        bank.addAccount(savingsAccount1);
        bank.addAccount(currentAccount1);
        bank.addAccount(savingsAccount2);
        bank.addAccount(currentAccount2);

        // displaying initial account details
        bank.displayAllAccounts();

        // performing transactions 
        savingsAccount1.deposit(500);
        currentAccount1.withdraw(300);
        savingsAccount1.applyInterest();

        // displaying transaction history
        System.out.println("\n\nTransaction History:");
        System.out.println("---------------------");
        savingsAccount1.displayTransactionHistory();
        currentAccount1.displayTransactionHistory();

        // transferring funds b/w accounts
        System.out.println("\n\nTransferring Funds:");
        System.out.println("---------------------");
        bank.transferFunds("SA001", "CA001", 200);
        bank.transferFunds("SA002", "CA002", 700);

        // displaying updated account details
        bank.displayAllAccounts();
    }
}
