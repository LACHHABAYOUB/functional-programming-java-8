package finalexam.part2q3.model;

public class Account {
    private long accountNumber;
    private double balance;

    public Account() { }

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    @Override
    public String toString() {
        return "{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
