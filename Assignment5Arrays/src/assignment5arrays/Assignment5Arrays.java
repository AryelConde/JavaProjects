
package assignment5arrays;
import ariel.Methods;
/**
 *
 * @author Rechel
 */
public class Assignment5Arrays {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //StockPriceTest();
        StudentGradeTest();
    }
    static void StudentGradeTest(){
        String[] name = {"Robin","Jo","Kelly","Jaimie"};
        int[] midtermScore = {28,78,92,83};
        int[] finalScore = {58,75,96,79};
        int[] assignmentGrade = {33,80,90,83};
        int[] finalGrade;
        
        System.out.println("Name\t  Midterm Score\t  Final Score\tAssignment Grade");
        for(int i = 0; i < name.length; i++){
        System.out.printf("%s\t\t%d\t\t%d\t\t%d\n", 
                name[i], 
                midtermScore[i], 
                finalScore[i], assignmentGrade[i]);
        }
        
        System.out.println();
        
        System.out.println("Name\t  Midterm Score\t  Final Score\tAssignment Grade   Final Grade");
        
        finalGrade = Methods.getFinalGrades(midtermScore, finalScore, assignmentGrade);
        for(int i = 0; i < name.length; i++){
        System.out.printf("%s\t\t%d\t\t%d\t\t%d\t\t%d\n", 
                name[i], 
                midtermScore[i], 
                finalScore[i], 
                assignmentGrade[i],
                finalGrade[i]);
        }
        
        int avgGrade = Methods.averageArray(finalGrade);
        
        System.out.printf("\nFinal Grade Average: %d\n",avgGrade);
        
        //int[][][][] newName, newMidScore, newFinScore, newAssignGrade, newFinalGrade;
        
        String[] newName = new String[]{"Robin","Jo","Kelly","Jaimie","Terry","Kerry"};
        int[] newMidtermScore = new int[]{28,78,92,83,76,71};
        int[] newFinalScore = new int[]{58,75,96,79,76,75};
        int[] newAssignmentGrade = new int[]{33,80,90,83,91,78};
        int[] newFinalGrade;
        
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
        
        int newAvgGrade = Methods.averageArray(newFinalGrade);
        System.out.printf("Class average = %d\n",newAvgGrade);
        
        int studentLowestGrade = Methods.getMinValue(newFinalGrade);
        int smallestIndex = Methods.getMinIndex(newFinalGrade);
        
        System.out.println("Student with the lowest overall final grade is " 
                + newName[smallestIndex] + " with a grade of " + studentLowestGrade);
        
        int studentHighestGrade = Methods.getMaxValue(newFinalGrade);
        int largestIndexValue = Methods.getMaxIndex(newFinalGrade);
        
        System.out.println("Student with the highest overall final grade is " 
                + newName[largestIndexValue] + " with a grade of " + studentHighestGrade);
        
        int numOfStudentsPassed = Methods.findFrequency(newFinalGrade, 60);
        System.out.println("Number of students passed: " + numOfStudentsPassed);
    }
}
