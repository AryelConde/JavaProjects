package testchangemachine_objectsclasses;

import java.util.Scanner;
import static testchangemachine_objectsclasses.ChangeMachine.input;

/**
 * Assignment #5 
 * Author: Ariel Villacampo 
 * Date: 11/22/2022
 */
public class TestChangeMachine_ObjectsClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ChangeMachine coins = new ChangeMachine();
//        coins.setLoonies(20);
//        coins.setToonies(20);
        
        System.out.println("Current coins in the machine: " + coins.getLoonies() + " loonies, " + coins.getToonies() + " toonies");

        ChangeMachine machine = new ChangeMachine(coins.getLoonies(), coins.getToonies()); //overloaded constructor
        int userBill = 0;
        boolean isInvalidPin = false; //set default to false since haven't asked for technician yet
        machine.checkStatus(); //checks status
        machine.getStatus();
        do { //loop for accepting money
            System.out.println("\nYou may insert a $5, $10, or 20$ bill.");
            System.out.print("Amount: ");
            userBill = userInput.nextInt();
            machine.acceptMoney(userBill); //callback method for accepting money from the user
            if (machine.getStatus() == false) { //if condition of machine is false, execute technician help
                System.out.println("Out of order! Cannot accept any more bills. Please call the technician to refill the machine.");

                System.out.print("Please call this no# 911 for technician\nDial: ");
                int dial = input.nextInt();
                if (dial != 911) {
                    while (dial != 911) {
                        System.out.print("Invalid #\nTry again: ");
                        dial = input.nextInt();
                    }

                    System.out.print("Please enter a valid PIN into the machine: ");
                    int validPIN = input.nextInt();

                    if (validPIN == 333) {
                        machine.machineRepair(); //callback method for refilling
                    } else {
                        isInvalidPin = true;
                        System.out.println("Invalid PIN!");
                    }
                } else if (dial == 911) {
                    System.out.print("Please enter a valid PIN into the machine: ");
                    int validPIN = input.nextInt();

                    if (validPIN == 333) {
                        machine.machineRepair();
                    } else {
                        isInvalidPin = true;
                        System.out.println("Invalid PIN!");
                    }
                }
            } else {
                System.out.println("Machine is ready.");
            }
        } while (isInvalidPin != true); //if invalid pin is true, program ends
    }
}
