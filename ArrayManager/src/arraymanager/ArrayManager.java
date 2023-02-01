/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraymanager;

import java.util.Scanner;
import ariel.Methods;

/**
 *
 * @author Ariel Villacampo
 */
public class ArrayManager {

    static Scanner userInput = new Scanner(System.in);
    static int userChoice = 0;

    public static void main(String[] args) {

        int[] validationArray = {};
        int[] userArray = {};
        int index = 0;
        menu();
        userChoice = userInput.nextInt();

        do {

            while (userChoice < 1 || userChoice > 4) {
                System.out.print("Invalid input!\n"
                        + "Try again: ");
                userChoice = userInput.nextInt();
            }

            if (userChoice == 1) {
                System.out.print("Create an array with your desired size: ");
                userChoice = userInput.nextInt();
                userArray = Methods.generateArray(userChoice);
                for (int i = 0; i < userArray.length; i++) {
                    System.out.print("Enter the values of your array: ");
                    userArray[i] = userInput.nextInt();

                    while (userArray[i] > 100) {
                        System.out.print("Input values between 1-100: ");
                        userArray[i] = userInput.nextInt();
                    }
                    if (userArray[i] <= 100);
                }
                menu();
                userChoice = userInput.nextInt();
            } else if (userChoice == 2) {
                Methods.printArray(userArray);
                menu();
                userChoice = userInput.nextInt();
            } else if (userChoice == 3) {
                System.out.print("Choose index from your array to edit: ");
                index = userInput.nextInt();

                int[] editedArray = Methods.editArrayByIndex(userArray, index);

                menu();
                userChoice = userInput.nextInt();
            }
        } while (userChoice != 4);
    }

    public static void menu() {
        System.out.println("--------- Array Manager ---------");
        System.out.print("1. Create New Array\n"
                + "2. Print Array\n"
                + "3. Edit Array by Index\n"
                + "4. Exit\n"
                + "---------------------------------\n"
                + "Choose a number from the menu: ");
    }
}
