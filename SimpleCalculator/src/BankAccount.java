public class BankAccount {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    //constructor can be overloaded
    public BankAccount() {
        this("55555",2050,"Default Name", "Default Address", "Default Phone");
        System.out.println("Empty constructor called!");
    }

    public BankAccount(String accountNumber, double balance, String name, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name =name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    //code -> generate -> Getter and Setter

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double deposit (double amount) {
        return balance += amount;
    }

    public double withdraw (double amount) {
        if (balance - amount < 0) {
            return -1;
        } else {
            return balance - amount;
        }
    }


}
