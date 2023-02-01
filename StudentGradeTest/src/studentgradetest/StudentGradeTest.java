/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentgradetest;
import ariel.Methods; //import methods from library for accessibility
import java.util.Scanner;
/**
 * Name: Ariel Villacampo
 * Project: Assignment 4 (arrays)
 */
public class StudentGradeTest {

     static Scanner input = new Scanner(System.in); //create static object after class for public accessibility within the project
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userChoice = 0;
        
        System.out.println("===================== Menu Option =====================\n"
                + "1. Display student grades\n"
                + "2. Display student final grades\n"
                + "3. Display class average\n"
                + "4. Display added students with final grades\n"
                + "5. Display class average with added students\n"
                + "6. Display student with lowest and highest final grade\n"
                + "7. Display number of students who passed\n"
                + "8. Exit\n"
                + "=======================================================");
        
        do { //do while for validation
            System.out.print("Please choose a number that you want to display on the menu: ");
            userChoice = input.nextInt();

            while (userChoice < 1 || userChoice > 8) { //validation input
                System.out.println("Invalid input!");
                System.out.print("Try again: ");
                userChoice = input.nextInt();
            }
            switch (userChoice) {
                case 1:
                    menu1();
                    break;
                case 2:
                    menu2();
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
                default:
                    break;
            }
        }while(userChoice != 8);
        }
    static void menu1(){ //static method with no argument
        String[] name = {"Robin","Jo","Kelly","Jaimie"};
        int[] midtermScore = {28,78,92,83};
        int[] finalScore = {58,75,96,79};
        int[] assignmentGrade = {33,80,90,83};
        int[] finalGrade;
        
        System.out.println("\nName\t  Midterm Score\t  Final Score\tAssignment Grade");
        System.out.println("========================================================");
        for(int i = 0; i < name.length; i++){
        System.out.printf("%s\t\t%d\t\t%d\t\t%d\n", 
                name[i], 
                midtermScore[i], 
                finalScore[i], assignmentGrade[i]);
        }
        System.out.println();
        }
    public static void menu2(){
        String[] name = {"Robin","Jo","Kelly","Jaimie"};
        int[] midtermScore = {28,78,92,83};
        int[] finalScore = {58,75,96,79};
        int[] assignmentGrade = {33,80,90,83};
        int[] finalGrade;
        System.out.println();
        
        System.out.println("Name\t  Midterm Score\t  Final Score\tAssignment Grade   Final Grade");
        System.out.println("======================================================================");
        
        //call method from the library and store variables into the parameter of the method
        finalGrade = Methods.getFinalGrades(midtermScore, finalScore, assignmentGrade);
        for(int i = 0; i < name.length; i++){
        System.out.printf("%s\t\t%d\t\t%d\t\t%d\t\t%d\n", 
                name[i], 
                midtermScore[i], 
                finalScore[i], 
                assignmentGrade[i],
                finalGrade[i]);
        }
        System.out.println();
    }
    public static void menu3(){
        String[] name = {"Robin","Jo","Kelly","Jaimie"};
        int[] midtermScore = {28,78,92,83};
        int[] finalScore = {58,75,96,79};
        int[] assignmentGrade = {33,80,90,83};
        int[] finalGrade;
        finalGrade = Methods.getFinalGrades(midtermScore, finalScore, assignmentGrade); //prerequisite for the average
        int avgGrade = Methods.averageArray(finalGrade); //final grade as parameter for getting average value
        
        System.out.printf("\nClass Average: %d\n",avgGrade);
        System.out.println();
    }
        
    public static void menu4(){
        String[] name = {"Robin","Jo","Kelly","Jaimie"};
        int[] midtermScore = {28,78,92,83};
        int[] finalScore = {58,75,96,79};
        int[] assignmentGrade = {33,80,90,83};
        
        //added array values
        String[] addedName = {"Terry","Kerry"}; String[] newName = new String[6];
        int[] addedMidtermScore = {86,71}; int[] newMidtermScore = new int[6];
        int[] addedFinalScore = {76,75}; int[] newFinalScore = new int[6];
        int[] addedAssignmentGrade = {91,78}; int[] newAssignmentGrade = new int[6];
        int[] addedFinalGrade; int[] newFinalGrade = new int[6];
        
        //copies the original values and stores the new values
        System.arraycopy(name, 0, newName, 0, name.length);
        System.arraycopy(addedName, 0, newName, name.length, addedName.length);
        System.arraycopy(midtermScore, 0, newMidtermScore, 0, midtermScore.length);
        System.arraycopy(addedMidtermScore, 0, newMidtermScore, midtermScore.length ,addedMidtermScore.length);
        System.arraycopy(finalScore, 0, newFinalScore, 0, finalScore.length);
        System.arraycopy(addedFinalScore, 0, newFinalScore, finalScore.length, addedFinalScore.length);
        System.arraycopy(assignmentGrade, 0, newAssignmentGrade, 0, assignmentGrade.length);
        System.arraycopy(addedAssignmentGrade, 0, newAssignmentGrade, assignmentGrade.length,addedAssignmentGrade.length);

        //insert variables as parameter into the method
        newFinalGrade = Methods.getFinalGrades(newMidtermScore, newFinalScore, newAssignmentGrade);
        System.out.println("\nName\t  Midterm Score\t  Final Score\tAssignment Grade   Final Grade");
        System.out.println("======================================================================");
        for(int i = 0; i < newName.length; i++){
        System.out.printf("%s\t\t%d\t\t%d\t\t%d\t\t%d\n", 
                newName[i], 
                newMidtermScore[i], 
                newFinalScore[i], 
                newAssignmentGrade[i],
                newFinalGrade[i]);
        }
        System.out.println();
    }
    public static void menu5(){
        
        String[] newName = new String[]{"Robin","Jo","Kelly","Jaimie","Terry","Kerry"};
        int[] newMidtermScore = new int[]{28,78,92,83,76,71};
        int[] newFinalScore = new int[]{58,75,96,79,76,75};
        int[] newAssignmentGrade = new int[]{33,80,90,83,91,78};
        int[] newFinalGrade;
        
        newFinalGrade = Methods.getFinalGrades(newMidtermScore, newFinalScore, newAssignmentGrade);
        int newAvgGrade = Methods.averageArray(newFinalGrade);
        System.out.printf("\nClass average = %d\n\n",newAvgGrade);
    }
        public static void menu6(){
        String[] newName = new String[]{"Robin","Jo","Kelly","Jaimie","Terry","Kerry"};
        int[] newMidtermScore = new int[]{28,78,92,83,76,71};
        int[] newFinalScore = new int[]{58,75,96,79,76,75};
        int[] newAssignmentGrade = new int[]{33,80,90,83,91,78};
        int[] newFinalGrade;
        
        newFinalGrade = Methods.getFinalGrades(newMidtermScore, newFinalScore, newAssignmentGrade);
        
        int studentLowestGrade = Methods.getMinValue(newFinalGrade);
        int smallestIndex = Methods.getMinIndex(newFinalGrade);
        
        System.out.println("\nStudent with the lowest overall final grade is " 
                + newName[smallestIndex] + " with a grade of " + studentLowestGrade);
        
        int studentHighestGrade = Methods.getMaxValue(newFinalGrade);
        int largestIndexValue = Methods.getMaxIndex(newFinalGrade);
        
        System.out.println("Student with the highest overall final grade is " 
                + newName[largestIndexValue] + " with a grade of " + studentHighestGrade);
        System.out.println();
        }
    public static void menu7(){
        String[] newName = new String[]{"Robin","Jo","Kelly","Jaimie","Terry","Kerry"};
        int[] newMidtermScore = new int[]{28,78,92,83,76,71};
        int[] newFinalScore = new int[]{58,75,96,79,76,75};
        int[] newAssignmentGrade = new int[]{33,80,90,83,91,78};
        int[] newFinalGrade;
        
        newFinalGrade = Methods.getFinalGrades(newMidtermScore, newFinalScore, newAssignmentGrade);
        
        //call frequency method from the library and set variables into the parameter with 60% criteria
        int numOfStudentsPassed = Methods.findFrequency(newFinalGrade, 60);
        System.out.println("\nNumber of students passed: " + numOfStudentsPassed);
        System.out.println();
    }
}
