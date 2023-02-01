/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stockpricetest;

import ariel.Methods; //library for methods
import java.util.Scanner;

/**
 * Name: Ariel Villacampo
 * Project: Assignment 4 (Arrays)
 */
public class StockPriceTest {

    static Scanner input = new Scanner(System.in); //create static object after class for public accesibility

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //main method
        int userChoice = 0;

        //menu option
        System.out.println("============== Menu Option ==============\n"
                + "1. Display stock's highest closing price\n"
                + "2. Display stock's lowest closing price\n"
                + "3. Display stock's average price\n"
                + "4. Number of days below the average price\n"
                + "5. Cost of stock during two-week period\n"
                + "6. Summary price\n"
                + "7. Closing price\n"
                + "8. Exit\n"
                + "=========================================");

        do {    //do while method for validation
            System.out.print("Please choose a number that you want to display on the menu: ");
            userChoice = input.nextInt();

            while (userChoice < 1 || userChoice > 8) { //validation
                System.out.println("Invalid input!");
                System.out.print("Try again: ");
                userChoice = input.nextInt();
            }

            //I use switch case method for because I personally prefer and I 
            //wanna try it since I haven't tried it. And I want to experiment a little bit.
            switch (userChoice) {
                case 1:
                    menu1(); //call static method for choice menu 1
                    break; //breaks the switch block
                case 2:
                    menu2(); //call static method 
                    break;
                case 3:
                    menu3();
                    break;
                case 4:
                    menu4();
                    break;
                case 5:
                    menu5();
                    break;
                case 6:
                    menu6();
                    break;
                case 7:
                    menu7();
                    break;
                default: //set default when none of the choice above meets from the user input
                    break;
            }
        } while (userChoice != 8); //break loop if user input chose exit
    }

    public static void menu1() { //static method with no argument
        double[] closingPrice = {25.0, 38.25, 39.50, 38.75, 37.33, 37.22, 29.56, 31.05, 30.77, 38.25};

        double highestClosingPrice = closingPrice[0]; //initialize from array
        for (int i = 0; i < closingPrice.length; i++) { //loop to get highest value from array
            if (closingPrice[i] > highestClosingPrice) {
                highestClosingPrice = closingPrice[i]; //where it stores the value from the array index
            }
        }
        System.out.printf("\nStock's highest closing price: %.2f\n\n", highestClosingPrice);
    }

    public static void menu2() {
        double[] closingPrice = {25.0, 38.25, 39.50, 38.75, 37.33, 37.22, 29.56, 31.05, 30.77, 38.25};
        double lowestClosingPrice = closingPrice[0];
        for (int i = 0; i < closingPrice.length; i++) {
            if (closingPrice[i] < lowestClosingPrice) {
                lowestClosingPrice = closingPrice[i];
            }
        }
        System.out.printf("\nStock's lowest closing price: %.2f\n\n", lowestClosingPrice);
    }

    public static void menu3() {
        double[] closingPrice = {25.0, 38.25, 39.50, 38.75, 37.33, 37.22, 29.56, 31.05, 30.77, 38.25};
        double averageClosingPrice = Methods.averageArray(closingPrice); //call method from the library
        System.out.printf("\nStock's average closing price: %.2f\n\n", averageClosingPrice);
    }

    public static void menu4() {
        double[] closingPrice = {25.0, 38.25, 39.50, 38.75, 37.33, 37.22, 29.56, 31.05, 30.77, 38.25};
        double averageClosingPrice = Methods.averageArray(closingPrice); //prerequisite for the counting occurence
        double countNumOfDays = Methods.countOccurances(closingPrice, averageClosingPrice);
        //call method from library and store variables into the parameter

        System.out.println("\nNumber of days below the average price: \n" + countNumOfDays);
    }

    public static void menu5() {
        double[] closingPrice = {25.0, 38.25, 39.50, 38.75, 37.33, 37.22, 29.56, 31.05, 30.77, 38.25};
        double sum = 0;
        for (int i = 0; i < closingPrice.length; i++) {
            sum += closingPrice[i]; //increment and store the array values
        }
        System.out.printf("\nCost of stock during two-week period: %.2f\n\n", sum);
    }

    public static void menu6() {
        double[] closingPrice = {25.0, 38.25, 39.50, 38.75, 37.33, 37.22, 29.56, 31.05, 30.77, 38.25};
        double highestClosingPrice = Methods.getMaxValue(closingPrice); //call max method from library
        double lowestClosingPrice = Methods.getMinValue(closingPrice); //call min method from library
        double averageClosingPrice = Methods.averageArray(closingPrice);
        double[] priceSummary = {highestClosingPrice, lowestClosingPrice, averageClosingPrice};

        System.out.println();

        System.out.println("Summary prices:");
        for (int i = 0; i < priceSummary.length; i++) {
            System.out.printf("%.2f\n", priceSummary[i]);
        }
        System.out.println();
    }

    public static void menu7() {
        double[] closingPrice = {25.0, 38.25, 39.50, 38.75, 37.33, 37.22, 29.56, 31.05, 30.77, 38.25};
        System.out.print("\nStock prices: ");
        double revArray = Methods.reverseSort(closingPrice); //call reverse method from library
    }
}
