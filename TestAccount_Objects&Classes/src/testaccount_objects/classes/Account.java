package testaccount_objects.classes;

import java.util.Scanner;

/**
 * Assignment #5 Author: Ariel Villacampo Date: 11/22/2022
 */
public class Account {

    public Scanner input = new Scanner(System.in);
    private static int numberOfAccounts = 0;
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
        this.balance = 0;
        this.annualInterestRate = 0;
        numberOfAccounts++;
        setID(numberOfAccounts);
    }

    public Account(double balance, double annualInterestRate) {
        setBalance(balance);
        setAnnualInterestRate(annualInterestRate);
        setID(numberOfAccounts);
    }

    public int getID() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.balance * this.annualInterestRate;
    }

    public void setID(int id) {
        this.id = id;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (int) (this.balance + (this.balance * this.annualInterestRate)) / 12;
    }

    public void withdraw(double amount) {
        if (amount >= 0 && amount <= balance) {
            balance -= amount;
        } else if (amount <= 0 || amount > balance) {
            do {
                System.out.print("Please withdraw within your account balance.\n"
                        + "Try again: ");
                amount = input.nextDouble();
            } while (amount <= 0 || amount >= balance);
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else if (amount <= 0) {
            while (amount <= 0) {
                System.out.print("Please deposit only positive values.\n"
                        + "Try again: ");
                amount = input.nextDouble();
            }
            balance += amount;
        }
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void transfer(double amount, Account otherAccount) {
        if(amount < 0){
            System.out.println("\nPlease provide correct information!");
        }
        else if (this.balance > amount) {
            this.balance -= amount;
            otherAccount.balance += amount;
            System.out.println("\nAccount " + this.getID() + " amount " + amount + " transfer to Account " + otherAccount.getID() + ".......\n"
                    + "Funds has been transferred!\n"
                    + "Account " + this.getID() + " balance: " + this.getBalance()
                    + "\nAccount " + otherAccount.getID() + " balance: " + otherAccount.getBalance());
        } else {
            System.out.println("Sorry, there is no sufficient balance on your account to make transfers. Please make sure to check your balance.");
        }
    }
}
