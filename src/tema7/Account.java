package tema7;

public class Account extends Customer {
    private int accountNumber;
    double balance;
    Customer accountOwner;

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber() {
        this.accountOwner = accountOwner;
    }

    public Account(int accountNumber, double balance, Customer accountOwner){
        super(accountOwner.getName(), accountOwner.getAddress(), accountOwner.getEmail());
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountOwner = accountOwner;
    }

    public void withdraw(double suma) throws InsuficientFundsException {
    }

}
