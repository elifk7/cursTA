package tema7;

public class SavingsAccount extends Account {

    public SavingsAccount(Account account) {
        super(account.getAccountNumber(), account.balance, account.accountOwner);

    }

    @Override
    public void withdraw(double suma) throws InsuficientFundsException{
        if(suma > balance) {
            System.out.println("The amount you entered is greater than the available balance : " + balance);
            System.out.println("Thank you for using our ATM!");
            throw new InsuficientFundsException("Insuficient funds for transaction");
        }
        else if (suma <= balance) {
            balance = balance - suma;
            System.out.println("Please pick your money!");
            System.out.println("Your new balance is : " + balance);
            System.out.println("Thank you for using our ATM!");
        }
    }
}
