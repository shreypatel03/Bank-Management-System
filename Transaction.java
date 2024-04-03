package Project;

// transaction class represents bank transaction
public class Transaction {
    private String transactionType;
    private double amount;
    private String date;

    // constructor to initialize transaction details
    public Transaction(String transactionType, double amount, String date) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.date = date;
    }

    public String toString() {
        return "Transaction Type: " + transactionType + ", Amount: " + amount + ", Date: " + date;
    }
}
