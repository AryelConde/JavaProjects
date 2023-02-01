/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ariel;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Rechel
 */
public class Methods {

    static Scanner userInput = new Scanner(System.in);

    public static int maxOfTwo(int a, int b) {

        int max = a;
        if (b > a) {
            max = b;
        }
        return max;
    }

    public static int maxOfThree(int a, int b, int c) {

        int max = maxOfTwo(a, b);
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void sayHello(String name) {

        System.out.println("Hello to" + name);
    }

    /**
     *
     * @param num - decimal number that contains 2 decimal places
     * @return
     */
    public static double roundDouble(double num) {
        num = Math.round(num * 100.0) / 100.0;
        return num;
    }

    /**
     *
     * @return - integer that is a random number between 1 and 1000
     */
    public static double circleRadius(double circumference) {
        double radius = circumference / Math.PI;
        return radius;
    }

    public static double cylinderVolume(double radius, double height) {
        double volume = Math.PI * radius * radius * height;
        return volume;
    }

    public static double coneVolume(double radius, double height) {
        double volume = Math.PI * radius * radius * height / 2;
        return volume;
    }

    public static double circleArea(double diameter) {
        double radius = diameter / 2;
        return Math.PI * radius * radius;
    }

    public static double rectangleArea(double width, double length) {
        return length * width;
    }

    public static double pizzaValue(double cost, double area) {
        return cost / area;
    }

    public static void pizzaValueDecider(double rectanglePizzaValue, double circlePizzaValue) {
        double bestValue = rectanglePizzaValue;

        if (rectanglePizzaValue < circlePizzaValue) {
            bestValue = circlePizzaValue;
            System.out.printf("The best value is the circle pizza with a cost of "
                    + "per square inch", bestValue);
        } else {
            System.out.printf("The best value is the rectangle pizza with a cost of "
                    + "per square inch", bestValue);
        }
    }

    public static float FahrenheitToCelsius(float Celsius, float Fahrenheit) {
        Celsius = (float) (5.0 / 9.0 * (Fahrenheit - 32));
        return Celsius;
    }

    public static float CelsiusToFahrenheit(float Fahrenheit, float Celsius) {
        Fahrenheit = (float) (9.0 / 5.0 * Celsius + 32);
        return Fahrenheit;
    }

    public static int reverseNum(int userInput) {
        int revNum;
        while (userInput > 0) {
            revNum = userInput % 10;
            System.out.println(revNum);
            userInput = userInput / 10;
        }
        return userInput;
    }

    public static int flip(int tossCoin) {
        Random rand = new Random();
        tossCoin = rand.nextInt(2);
        return tossCoin;
    }

    public static int randomNum() {
//        int rand = (int)(Math.random()*(1000-1)+1);
//        return rand;

        return (int) (Math.random() * (1000 - 1) + 1); // another way of returning variable
    }

    public static double calculateTaxableIncome(double genInc, double invInc,
            double otherInc, double regDeduc, double otherDeduc) {
        double taxableIncome = ((genInc + invInc + otherInc) - regDeduc - (otherDeduc / 2));
        return taxableIncome;
    }

    public static double calculateIncomeTax(double taxableIncome) {
        double tenPercent = 0, twelvePercent = 0, fifteenPercent = 0, twentyPercent = 0, incTax;

        if (taxableIncome > 20000) {
            tenPercent = 0.1 * 20000;
            taxableIncome = taxableIncome - 20000;
        }

        if (taxableIncome > 20000) {
            twelvePercent = 0.12 * 20000;
            taxableIncome = taxableIncome - 20000;
        }

        if (taxableIncome > 20000) {
            fifteenPercent = 0.15 * 20000;
            taxableIncome = taxableIncome - 20000;
        } else {
            twentyPercent = 0.2 * taxableIncome;
            taxableIncome = taxableIncome - taxableIncome;
        }

        incTax = tenPercent + twelvePercent + fifteenPercent + twentyPercent;
        return incTax;
    }

    public static int[] populateArray(int[] array, int size) {
        //initialize array based on the size user
        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99) + 1;
        }
        return array;
    }

    public static int averageArray(int[] array) {
        //initialize the sum
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum / array.length);
    }

    public static double[] populateArray(double[] array, int size) {
        array = new double[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 99) + 1;
        }
        return array;
    }

    public static double averageArray(double[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum / array.length);
    }

    public static int[] populateRevArray(int[] array, int size) {
        //initialize array based on the size user
        array = new int[size];

        for (int i = array.length; i > 0; i--) {
            array[i] = (int) (Math.random() * 99) + 1;
        }
        return array;
    }

    public static int getMinValue(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static double getMinValue(double[] array) {
        double smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int getMaxValue(int[] array) {
        int largestValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestValue) {
                largestValue = array[i];
            }
        }
        return largestValue;
    }

    public static double getMaxValue(double[] array) {
        double largestValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestValue) {
                largestValue = array[i];
            }
        }
        return largestValue;
    }

    public static int getMinIndex(int[] array) {
        int smallestIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int getMaxIndex(int[] array) {
        int largestIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[largestIndex]) {
                largestIndex = i;
            }
        }
        return largestIndex;
    }

    public static int countOccurances(int[] array, int itemToCount) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < itemToCount) {
                count++;
            }
        }
        return count;
    }

    public static double countOccurances(double[] array, double itemToCount) {
        double count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < itemToCount) {
                count++;
            }
        }
        return count;
    }

    public static double reverseSort(double[] array) {
        double swap, reversedArray = 0;
        for (int i = 0; i < array.length; i++) {
            for (int c = i; c < array.length; c++) {
                if (array[i] >= array[c]) {
                    swap = array[i];
                    array[i] = array[c];
                    array[c] = swap; //sort into ascending order first
                }
            }
        }

        System.out.println();
        //descending order of the array
        for (int x = array.length - 1; x >= 0; x--) {
            System.out.println(array[x]);
            reversedArray = x;
        }
        return reversedArray;
    }

    public static int[] getFinalGrades(int[] mid, int[] fin, int[] ass) {
        int[] finalGrade = new int[mid.length];
        for (int i = 0; i < mid.length; i++) {
            finalGrade[i] = (int) ((mid[i] * 0.40) + (fin[i] * 0.45) + (ass[i] * 0.15));
            //formula for the final grade inserting array values
        }
        return finalGrade;
    }

    public static int findFrequency(int[] array, int value) { //method for frequency with return value
        int frequency = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= value) {
                frequency++;
            }
        }
        return frequency;
    }

    public static int[] generateArray(int size) {
        int[] array = new int[size];
        return array;
    }

    public static void printArray(int[] arrayToPrint) { 
        System.out.println("Your array: ");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println("Index " + (i + 1) + ": " + arrayToPrint[i]);
        }
    }

    public static int[] editArrayByIndex(int[] arrayToEdit, int index) {
        // { 1 , 2 , 3 , 4 , 5 }
        System.out.print("Enter the value of your index: ");
        arrayToEdit[index-1] = userInput.nextInt();

        System.out.println("Your new array is: ");
        for (int i = 0; i < arrayToEdit.length; i++) {
            System.out.println("Index " + (i + 1) + ": " + arrayToEdit[i]);
        }
        return arrayToEdit;
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
