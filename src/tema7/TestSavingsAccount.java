package tema7;

import java.util.Scanner;

public class TestSavingsAccount {

    public static void main(String[] args) throws InsuficientFundsException {

        Scanner scan = new Scanner(System.in);

        Customer customer = new Customer("Elif", "adresaElif", "elif@mail.com");

        Account account = new Account(1, 400, customer);

        SavingsAccount savingsAccount = new SavingsAccount(account);

        System.out.println("Hi " + customer.getName());
        System.out.println("Please enter the amount to withdraw:");
        double amount = scan.nextInt();

        savingsAccount.withdraw(amount);
    }
}
