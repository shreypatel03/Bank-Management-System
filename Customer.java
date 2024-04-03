package Project;

// customer class represents bank customers
public class Customer {
    private String name;
    private String address;
    private String phoneNumber;
    private Account account; // composition: customer is "part-of" account

    // constructor to initialize customer details
    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Phone Number: " + phoneNumber;
    }
    
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }    
}
