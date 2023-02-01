package testchangemachine_objectsclasses;

import java.util.Scanner;

/**
 * Assignment #5 
 * Author: Ariel Villacampo 
 * Date: 11/22/2022
 */
public class ChangeMachine {

    static Scanner input = new Scanner(System.in);
    private int loonies;
    private int toonies;
    private boolean status;

    public ChangeMachine() {

    }

    public ChangeMachine(int loonies, int toonies) {
        setLoonies(loonies);
        setToonies(toonies);
    }

    public int getLoonies() {
        return this.loonies;
    }

    public int getToonies() {
        return this.toonies;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setLoonies(int loonies) {
        if (loonies >= 0) {
            this.loonies = loonies;
        } else if (loonies <= 0) {
            System.out.println("You cannot have a negative number of coins!");
        }
    }

    public void setToonies(int toonies) {
        if (toonies >= 0) {
            this.toonies = toonies;
        } else if (toonies <= 0) {
            System.out.println("You cannot have a negative number of coins!");
        }
    }

    private void setStatus(boolean status) {
        this.status = status;
    }

    public void acceptMoney(int amount) {
        while (amount != 5 && amount != 10 && amount != 20) {
            System.out.print("You must insert a $5, $10, or 20$ bill. Try again: ");
            amount = input.nextInt();
        }
        makeChange(amount);
        checkStatus();
        if (status == false) {
            System.out.println("Out of Order! Here is your bill back.");
            returnMoney(amount);
        } else {
            System.out.println("Loonies left: " + getLoonies() + "\n"
                    + "Toonies left: " + getToonies()
                    + "\nTotal coins in the machine: " + totalCoinsInTheMachine());
        }
    }

    public void checkStatus() {
        if (loonies >= 0 && toonies >= 0) {
            setStatus(true);
        } else {
            setStatus(false);
        }
    }

    private void makeChange(int amount) {
        int countLoonies = 0;
        int countToonies = 0;
        if (amount == 5) {
            countToonies = 2;
            countLoonies++;
            setToonies(toonies -= countToonies);
            setLoonies(loonies -= countLoonies);
        } else if (amount == 10 || amount == 20) {
            countToonies = amount / 2;
            setToonies(toonies -= countToonies);
        }
    }

    private void returnMoney(int amount) {
        int returnLoonies = 0;
        int returnToonies = 0;
        if (amount == 5) {
            returnLoonies++;
            returnToonies += 2;
            setLoonies(loonies += returnLoonies);
            setToonies(toonies += returnToonies);
            System.out.println("Return loonies: " + returnLoonies
                    + "\nReturn toonies: " + returnToonies);
        } else if (amount == 10 || amount == 20) {
            returnToonies += amount / 2;
            setToonies(toonies += returnToonies);
            System.out.println("Return toonies: " + returnToonies);
        }
    }

    public int totalCoinsInTheMachine() {
        return loonies + (toonies * 2);
    }

    public void machineRepair() {
        int numOfLoonies = 0;
        int numOfToonies = 0;
        do {
            System.out.print("Number of 1$ to refill: ");
            numOfLoonies = input.nextInt();
            System.out.print("Number of 2$ to refill: ");
            numOfToonies = input.nextInt();

            if (numOfLoonies > 0 && numOfToonies > 0) {
                this.loonies += numOfLoonies;
                this.toonies += numOfToonies;
                System.out.println("Total 1$: " + this.loonies + "\nTotal 2$: " + this.toonies
                        + "\nMachine is ready.");
            } else {
                System.out.println("You cannot have a negative number of coins!");
            }
        } while (numOfLoonies < 0 || numOfToonies < 0);
    }
}
