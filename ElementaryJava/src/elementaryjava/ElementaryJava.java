package elementaryjava;     //package to group related classes 
import java.util.Scanner;
public class ElementaryJava {     // start always with a class to begin creating objects

/*
Assignment 1: Elementary Java Program
Author: Ariel Villacampo
Date: 09/14/2022
*/
    
//import Scanner to get input from the user
//what you named for your scanner variable is the one that you'll use for getting input from the user
    
public static void main(String[] args) {                     
        
//        Scanner input = new Scanner(System.in);                   //input is the variable name of our scanner method
//        int userInput;                                            //use int data type because we wanna get integer value (userInput - variable that will be use later to get input from the user)
//        System.out.println("Determining integer");                //print statement    
//        System.out.println("\nEnter any whole number:");          //print statement
//
//        userInput = input.nextInt();                              //input.nextInt(); is the variable of our scanner to get input from the user
//        if(userInput % 2 == 0)                                    //use if statement for conditions //if userInput remainder is equal to 0 then it is an even number
//        {
//        System.out.print("\nYou input an even number.");}
//        else                                                      //if there is an "if" condition, then there will be "else" also //if userInput remainder is not equal to 0, condition else will give the user information that it is not an even number, otherwise it is an odd
//        {
//        System.out.print("\nYou input an odd number.");}
//       
//        
//        
//        Scanner input = new Scanner(System.in);                   //scanner to get input from the user
//        int num1, num2, mult;                                     //use int with a list of variables to get the value
//        System.out.printf("Enter your first number: ");
//        num1 = input.nextInt();                                   //use num1 variable to store user input
//        System.out.printf("Enter your second number: ");
//        num2 = input.nextInt();                                   //use num2 variable to store user input
//        mult = num1%num2;                                         //mult is the result of the multiple of num1 & num2 //use remainder operator to get the multiple of num1
//        if(mult == 0)                                             //use if condition for mult is equal to zero to determine whether even or odd number
//        {
//        System.out.printf("%d is a multiple of %d", num1, num2);    //there is %d in the print statement, the first %d correlates to value of num1 whereas the last %d is the value of num2
//        }
//        else                                                          //else if it's not multiple - print statement
//        {
//        System.out.printf("%d is not a multiple of %d", num1,num2);
//        }
//
//
//        Scanner input = new Scanner(System.in);
//        double radius, diameter, circumference, area;                                      //use double data type since we want to get the radius, diameter, circumference and area
//        System.out.println("Enter the radius: ");                                         //print statement
//        radius = input.nextDouble();                                                      //use radius variable to get radius input from the user
//        diameter = radius * 2;                                                            //formula to get diameter is radius * 2
//        System.out.println("The diameter of the circle is: "+diameter);
//        circumference = Math.PI * diameter;                                               //formula to get circumference is pi * diameter but we're using Math.PI in this application
//        System.out.println("The circumference of the circle is: "+circumference);
//        area = Math.PI * radius * radius;                                                 //formula to get area is pi*radius*radius
//        System.out.println("The area of the circle is: "+area);
//
//

//        Scanner input = new Scanner(System.in);
//        int userInput, digits1, digits2, digits3, digits4, digits5;                       //list all the variables
//        System.out.println("Enter a single number consisting of 5 digits: ");
//        userInput = input.nextInt();
//        digits1 = userInput / 10000;                                                      /*
//        digits2 = (userInput % 10000) / 1000;                                             *Divides the user input using the division operator
//        digits3 = ((userInput %10000) % 1000) / 100;                                      *We're asking for a single number consisting 5 digits, so, divide: 1st digit into 10,000 - 2nd digit into 1,000 - 3rd digit into 100 - digit 4 into 10 - digit 5 remainder
//        digits4 = (((userInput % 10000) % 1000) % 100) / 10;                              */
//        digits5 = (((userInput % 10000) % 1000) % 100) % 10;                              
//        System.out.printf("%d%s%d%s%d%s%d%s%d%n",digits1,"   ",digits2,"   ",digits3,"   ",digits4,"   ",digits5);


//        Scanner input = new Scanner(System.in);
//        double weight, height, BMI;                         //store list of variables into one data type which is double
//        System.out.println("BMI Calculator");
//        System.out.println("To calculate your BMI: ");
//        System.out.printf("\nEnter your weight in pounds: ");
//        weight = input.nextDouble();                        //store user input into weight variable
//        System.out.printf("Enter your height in inches: ");
//        height = input.nextDouble();                          //store user input into height variable
//        BMI = (weight*703)/(height*height);                   //use this formula to get BMI from the user
//        System.out.println("\nYour BMI index is = "+BMI);
//        
//         
//         //****Use if condition to determine the user's class based on the user's BMI input****
//          
//          
//        if(BMI <= 18.5)                                       //if BMI is less than or equal to 18.5 then print the underweight class
//        {
//            System.out.println("\nYou belong to the underweight class");
//        }
//        else if(BMI >= 18.5 && BMI <=24.9)                    //if BMI is greater than or equal to 18.5 && (use AND operator for joint condition; meaning there will be 2 if on one condition) BMI is less than or equal to 24.9
//        {
//            System.out.print("\nYou belong to the normal class");
//        }
//        else if(BMI >= 25 && BMI <=29.9)                      //same condition above
//        {
//            System.out.print("\nYou belong to the overweight class");
//        }
//        else if(BMI >= 30)                                    //same condition applied above
//        {
//            System.out.print("\nYou belong to the obese class");
//        }
//          String bmiClasses = """              
//                              Underweight: less than 18.5
//                              Normal: between 18.5 and 24.9
//                              Overweight: between 25 and 29.9
//                              Obese: 30 or greater""";            //I am using textblock here to list bmi classes in an efficient way // textblock starts with three double-quote marks """ following with a space and indent
//          System.out.println(bmiClasses);
    }
}
