package assignment3methods;

import java.util.Scanner;
import ariel.Methods;
import java.util.Random;

/**
 * Author: Ariel Villacampo
 * Date: October 19, 2022
 * Assignment 3 - Methods
 */
public class Assignment3Methods {

    static Scanner userInput = new Scanner(System.in); //assigned in class as static for accessibility to static methods
    static Random rand = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //main method
        
//        call each static methods
        
//        Question1();
//        Question2();
//        Question3();
//        Question4();
//        Question5();
        Question6();

    }

    public static void Question1() { //static to import into main method and void method because no return value

        float Celsius = 0;
        float Fahrenheit = 0; //initialize values 
        System.out.print("Fahrenheit to Celsius\nCelsius to Fahrenheit\n");
        System.out.print("\nPlease input fahrenheit: ");
        Fahrenheit = userInput.nextFloat();
        Celsius = Methods.FahrenheitToCelsius(Celsius, Fahrenheit); //call methods from library to get celsius conversion
        System.out.printf("%.2f", Celsius);

        System.out.print("\nPlease input celsius: ");
        Celsius = userInput.nextFloat();
        Fahrenheit = Methods.CelsiusToFahrenheit(Fahrenheit, Celsius); //call methods from library to get fahrenheit conversion
        //formula on the library methods and store the user values into the parameter of that method
        System.out.printf("%.2f\n", Fahrenheit);
    }

    public static void Question2(){
        int input, reverseNum;
        System.out.print("Input 5 digits number: ");
        input = userInput.nextInt();

        reverseNum = Methods.reverseNum(input); //call method from library and store the user input to the parameter of the method
    }

    public static void Question3() {
        int userGuess, tossCount = 0, tossResult = 0;
        int randNum = rand.nextInt(40); //for random toss count
        System.out.println("Toss Coin\nHeads or tails?\nLet Tail = 0\nand Head = 1\n");
        System.out.print("Guess: ");
        userGuess = userInput.nextInt();

        while (tossCount != randNum) {
            if (userGuess <= 1) { //if it is true, execute the code
                int toss = Methods.flip(userGuess); //call method from the library and store the user input to the parameter
                System.out.println(toss == 0 ? "Tail" : "Head"); //if toss is equal to 0, print tail. Else, print head
                tossResult = toss; //store the toss result
                tossCount++; //count toss everytime loop runs
            } else { //else invalid
                System.out.println("Invalid input");
                break; //break to get out of the loop
            }
        }
        System.out.println("Toss count: " + tossCount);
        if (userGuess == tossResult) {
            System.out.println("You guess it right!");
        } else {
            System.out.println("Sorry, better luck next time!");
        }
    }

    public static void Question4() {
        Scanner input = new Scanner(System.in);
        int userGuess = 0, randNum = Methods.randomNum(); //call method from the library to assign random numbers between 1-1000
        System.out.println("Guessing game");
        while (userGuess != randNum) {
            System.out.print("\nGuess the number between 1 and 1000: ");
            userGuess = input.nextInt();

            if (userGuess > randNum) {
                System.out.println("Too high, guess again!");
            } else if (userGuess < randNum) {
                System.out.println("Too low, guess again");
            } else {
                System.out.println("\nCongratulations! You guessed the number");
            }
        }
    }
    public static void Question5() {
        double genInc, invInc, otherInc, regDeduc, otherDeduc;
        double taxableInc, incTax;

        System.out.print("Input your general income: ");
        genInc = userInput.nextDouble();

        System.out.print("Input your investment income: ");
        invInc = userInput.nextDouble();

        System.out.print("Input your other income: ");
        otherInc = userInput.nextDouble();

        System.out.print("Input your regular deductions: ");
        regDeduc = userInput.nextDouble();

        System.out.print("Input your other deductions: ");
        otherDeduc = userInput.nextDouble();

        taxableInc = Methods.calculateTaxableIncome(genInc, invInc, otherInc, regDeduc, otherDeduc);
        //call method from the library and store the user values into the parameter
        System.out.printf("\nYour taxable income is: %.2f ",taxableInc); //formatted as 2 decimal places
        
        System.out.print("\n\nTo calculate your income tax, please input your taxable income: ");
        incTax = userInput.nextDouble();
        
        
        incTax = Methods.calculateIncomeTax(taxableInc); //call method from the library
        System.out.printf("Your income tax amount is: %.2f \n",incTax);
    }
     public static void Question6() {
        double genInc, invInc, otherInc, regDeduc, otherDeduc;
        double taxableInc, incTax, prevIncTax;

        System.out.print("Input your general income: ");
        genInc = userInput.nextDouble();

        System.out.print("Input your investment income: ");
        invInc = userInput.nextDouble();

        System.out.print("Input your other income: ");
        otherInc = userInput.nextDouble();

        System.out.print("Input your regular deductions: ");
        regDeduc = userInput.nextDouble();

        System.out.print("Input your other deductions: ");
        otherDeduc = userInput.nextDouble();

        taxableInc = Methods.calculateTaxableIncome(genInc, invInc, otherInc, regDeduc, otherDeduc);
        //call method from the library and store user values to the parameter
        System.out.printf("\nYour taxable income is: %.2f" ,taxableInc);
        
        System.out.print("\n\nTo calculate your income tax, please input your taxable income: ");
        incTax = userInput.nextDouble();
        
        
        incTax = Methods.calculateIncomeTax(taxableInc);
        System.out.printf("Your income tax amount is: %.2f",incTax);
        
        System.out.print("\n\nProvide an amount for your previously paid income tax: ");
        prevIncTax = userInput.nextDouble();
        
        incTax = incTax - prevIncTax; //formula for due income tax
        
        if(incTax < 0){
            incTax = (-1) * incTax; //to get absolute value
            System.out.printf("\nYou have a return amount of: %.2f\n",incTax);
        }
        else{
            System.out.printf("\nAmount of income tax owed: %.2f\n",incTax);
        }
    }
}
