package testaccount_objects.classes;

import java.util.Scanner;

/**
 * Assignment #5 Author: Ariel Villacampo Date: 11/22/2022
 */
public class TestAccount_ObjectsClasses {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Number of accounts created: " + Account.getNumberOfAccounts());

        Account account1 = new Account();
        System.out.println("\nAccount ID: " + account1.getID()
                + "\nBalance: " + account1.getBalance()
                + "\nNew Account created!");
        account1 = new Account(500, 0.3);

        System.out.println("\nAccount ID: " + account1.getID()
                + "\nBalance: " + account1.getBalance()
                + "\nAnnual Interest: " + account1.getAnnualInterestRate()
                + "\nMonthly Interest: " + account1.getMonthlyInterestRate());

        Account account2 = new Account();
        System.out.println("\nAccount ID: " + account2.getID()
                + "\nBalance: " + account2.getBalance()
                + "\nNew Account created!");
        account2 = new Account(1000, 0.5);

         System.out.println("\nAccount ID: " + account2.getID()
                + "\nBalance: " + account2.getBalance()
                + "\nAnnual Interest: " + account2.getAnnualInterestRate()
                + "\nMonthly Interest: " + account2.getMonthlyInterestRate());

        System.out.println();

        String withdrawOrDeposit = "";
        System.out.print("Withdraw or Deposit? (Note: Use capital letter on the first letter when entering input i.e. 'Withdraw')\n"
                + "Input: ");
        withdrawOrDeposit = userInput.nextLine();

        switch (withdrawOrDeposit) {
            case "Withdraw" -> {
                System.out.print("\nAccount ID: " + account1.getID()
                        + "\nBalance: " + account1.getBalance()
                        + "\nWithdrawal amount: ");
                double userWithdrawals = userInput.nextDouble();
                account1.withdraw(userWithdrawals);
                System.out.println("New balance: " + account1.getBalance());
                System.out.print("\nAccount ID: " + account2.getID() + "\n"
                        + "Balance: " + account2.getBalance()
                        + "\nWithdrawal amount: ");
                userWithdrawals = userInput.nextDouble();
                account2.withdraw(userWithdrawals);
                System.out.println("New balance: " + account2.getBalance());

                System.out.println();

                account1.transfer(100, account2);
                account2.transfer(300, account1);
            }
            case "Deposit" -> {
                System.out.print("\nAccount ID: " + account1.getID()
                        + "\nBalance: " + account1.getBalance()
                        + "\nDeposit amount: ");
                double userDeposit = userInput.nextDouble();
                account1.deposit(userDeposit);
                System.out.println("New balance: " + account1.getBalance());
                System.out.print("\nAccount ID: " + account2.getID() + "\n"
                        + "Balance: " + account2.getBalance()
                        + "\nDeposit amount: ");
                userDeposit = userInput.nextDouble();
                account2.deposit(userDeposit);
                System.out.println("New balance: " + account2.getBalance());

                account1.transfer(500, account2);
                account2.transfer(300, account1);
            }
            default ->
                System.out.println("Invalid input!");
        }
        System.out.println("\nTotal accounts created: " + Account.getNumberOfAccounts());
    }
}
