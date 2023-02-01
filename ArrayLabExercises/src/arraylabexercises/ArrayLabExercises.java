package arraylabexercises;

import ariel.Methods;

/**
 *
 * @author Rechel
 */
public class ArrayLabExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        Question1();
//        Question2();
//        Question3();
//        Question4and5();
        TestParallelArrays();
//        Question7();
    }

    public static void Question1() {

        int[] numbers = new int[20];

        numbers = Methods.populateArray(numbers, 20);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int arrayAvg = Methods.averageArray(numbers);
//        System.out.println("The average is: " + arrayAvg);

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > arrayAvg) {
                count++;
            }
        }
        System.out.println("The average is " + arrayAvg
                + " and the number of values greater than the average is " + count);
    }

    public static void Question2() {
        int[] numbers = new int[10];
        numbers = Methods.populateArray(numbers, 10);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("=====");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }

    public static void Question3() {
        double[] numbers = new double[20];

        numbers = Methods.populateArray(numbers, 20);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        double arrayAvg = Methods.averageArray(numbers);
//        System.out.println("The average is: " + arrayAvg);

        double count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > arrayAvg) {
                count++;
            }
        }
        System.out.println("The average is " + arrayAvg
                + " and the number of values greater than the average is " + count);
    }

    public static void Question4and5() {
        int[] numbers = new int[10];
        numbers = Methods.populateArray(numbers, 10);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); //empty print line

        int minValue, minIndex;

        minValue = Methods.getMinValue(numbers);
        minIndex = Methods.getMinIndex(numbers);

        System.out.println("The min value is " + minValue
                + " and the min index is " + minIndex);
    }

    public static void TestParallelArrays() {

        String[] product = {"CD", "DVD", "tape", "LP33", "USB", "floppy"};
        double[] price = {0.25, 1.89, 8.50, 138.75, 57.33, 1.22};

        int[] quantities = new int[6];
        quantities = Methods.populateArray(quantities, 6);

        double[] total = new double[6];

        for (int i = 0; i < total.length; i++) {
            total[i] = Methods.roundDouble(price[i]) * quantities[i];
        }

        System.out.println("Product\tPrice\tQuant\tTotal");
        for (int i = 0; i < product.length; i++) {
            System.out.printf("%s\t%.2f\t%d\t%.2f\n", product[i], price[i], quantities[i], total[i]);
        }
    }

    public static void Question7() {

        int[] sample1 = {1, 2, 2, 1, 1, 3, 3, 2, 2, 1};
        int[] sample2 = {3, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 2, 3, 3, 2, 2, 2, 3};
        int[] sample3 = {1, 1, 1, 2, 2, 1, 3, 2, 1, 1, 1, 2};

        int[] totals = new int[40];
        //source, starting position, destination, starting, length for source
        System.arraycopy(sample1, 0, totals, 0, sample1.length);
        System.arraycopy(sample2, 0, totals, sample1.length, sample2.length);
        System.arraycopy(sample3, 0, totals, (sample1.length + sample2.length), sample3.length);

//            for(int i = 0; i < totals.length; i++){
//                System.out.print(totals[i] + " ");
//            }
//            System.out.println();
        int awfulCount = Methods.countOccurances(totals, 1);
        int okCount = Methods.countOccurances(totals, 2);
        int deliciousCount = Methods.countOccurances(totals, 3);

        System.out.println("The ratings are: \n"
                + "Awful: " + awfulCount + "\n"
                + "OK: " + okCount + "\n"
                + "Delicious: " + deliciousCount);

        System.out.println();
        double awfulPercentage = (double) awfulCount / totals.length * 100;
        double okPercentage = (double) okCount / totals.length * 100;
        double deliciousPercentage = (double) deliciousCount / totals.length * 100;

        System.out.printf("The percentage ratings are: \n"
                + "Awful: %.2f%%\n"
                + "OK; %.2f%%\n"
                + "Delicious: %.2f%%\n", awfulPercentage, okPercentage, deliciousPercentage);
    }
}
