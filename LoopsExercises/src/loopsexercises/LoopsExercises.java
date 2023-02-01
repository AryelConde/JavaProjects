package loopsexercises;
import java.util.Scanner;
/**
 *
 * @author Rechel
 */
public class LoopsExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        ***Write a program that prompts the user to enter ten students’ names and their
//        scores on a test. Your program will then display the highest mark and the student’s
//        name who received it.***
        Scanner input = new Scanner(System.in);
//        int anyNum = Integer.MAX_VALUE;
//        int studentScore;
//        int highestGrade = 0;
//        int i;
//        String studentName = null;
//        String highestMark = "";
//        for(int i = 0; i < 4; i++)
//        {
//            System.out.print("\nPlease enter your full name: ");
//            studentName = input.nextLine();
//            System.out.print("Please enter your score: ");
//            studentScore = input.nextInt();
//            
//            
//        if(studentScore > highestGrade)
//        {
//            highestGrade = studentScore;
//            highestMark = studentName;
//        } 
//        }
//        System.out.println("The highest mark goes to " +highestMark+ " with a mark of " +highestGrade);
//
// -------------------------------------------------------------------------------------------------------
//
//        ***Redo the program from question one assuming that you do not know how many
//           students there are. Use a grade of -1 to signal the end of input.***
//        do
//        {
//            System.out.print("\nPlease enter your name: ");
//            studentName = input.next();
//            System.out.print("Please enter your score: ");
//            studentScore = input.nextInt();
//            System.out.println("Input -1 to your score if you want to stop.");
//            if(studentScore > highestGrade)
//            {
//                highestGrade = studentScore;
//                highestMark = studentName;
//            }
//        }
//        while(studentScore != -1);
//        studentScore--;
//        System.out.println("\nThe highest mark goes to " + highestMark + " with a mark of " + highestGrade);
//-------------------------------------------------------------------------------------------------------
//        ***Use a loop to find the smallest number whose squared value is greater than 12,000.***
//        int a = 11;
//        int b = a;
//        int squaredValue = 12000;
//        do
//        {
//            b = b * b;
//        }
//        while(b >= squaredValue);
//        b--;
//        System.out.println(b); 
//        
//-------------------------------------------------------------------------------------------------------
//        ***Write a program that generates ten random addition questions for two integers
//           between 1 and 100. You program should keep track of how many questions are
//           answered correctly and print the results.***
//        int countUserCorrectAnswer = 0;
//        int userAnswer;
//        for(i = 1; i <= 10; i++)
//        {
//            int value1Rand = (int)(Math.random() * 100);
//            int value2Rand = (int)(Math.random() * 100);
//            System.out.print("\n"+i+ ". Enter the sum value " + value1Rand + " + " + value2Rand + " of these two: ");
//            userAnswer = input.nextInt();
//            
//                int sumRand = value1Rand + value2Rand;
//                {
//                    System.out.println("Invalid input");
//                }
//                if(sumRand == userAnswer){
//                    System.out.println("You are correct!");
//                    countUserCorrectAnswer++;
//                }
//                else {
//                    System.out.println("Incorrect! The sum of the " + value1Rand + " and " + value2Rand + " is " + sumRand);
//                }
//        }
//        System.out.println("\nOut of 10 questions, you got " + countUserCorrectAnswer + " correct answers!");
//-------------------------------------------------------------------------------------------------------
//        ***Write a program that displays the following table:***
//            Kilograms Pounds
//            1 2.2
//            3 6.6
//            5 11.0
//            . .
//            . .
//            . .
//            197 433.4
//            199 437.8
//
//        float pounds = 2.2f;
//        for(i = 1; i < 201; i+=2)
//        {
//            pounds = i * 2.2f;
//            System.out.println(+ i + " kilogram = " + pounds + " pounds");
//        }
//
//         write a program that pritns the even numbers between 1 and 100
//          int num = 0;
//          for(int i = 2; i <= 100; i+=2)
//          {
//              if(i % 2 == 0) //to get even number divide it by 2 and if the remainder is 0 then you get even number
//                  System.out.println(i);
                  
//                  int userInput;
//                  String Done = "Done";
//                  int sum = 0;
//                  do{
//                      System.out.println("Input any number: ");
//                      userInput = input.nextInt();
//                      x 
//                      sum += userInput;
//                  }
//                  while(sum == 100);
//                  System.out.println(Done);
          }
    }