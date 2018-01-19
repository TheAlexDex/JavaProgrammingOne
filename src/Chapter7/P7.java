package Chapter7;

import java.util.Scanner;

/**
 * Program to display the average of a given array.
 *
 * @author Alex Jasso
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many numbers will you input: ");
        int length = input.nextInt();
        int[] inputArray = new int[length];
        ArrayMaker(inputArray, length);
        double average = Averager(inputArray, length);
        System.out.println("The average for the array is " + average);
        ArrayPrinter(inputArray, length);
    }

    /**
     * Method to ask the user to input numbers for an array
     *
     * @param array an array with the length of user input
     * @param length the length given by the user for the array
     */
    public static void ArrayMaker(int[] array, int length) {
        Scanner input = new Scanner(System.in);
        int constant = 0;
        System.out.print("Now please enter your numbers: ");
        while (constant < length) {
            array[constant] = input.nextInt();
            constant++;
        }
    }

    /**
     * Method to average out the numbers in the array
     *
     * @param array the array made with the numbers in them
     * @param length the length of the array
     * @return the average of the array
     */
    public static double Averager(int[] array, int length) {
        int constant = 0;
        int total = 0;
        double average;
        while (constant < length) {
            total += array[constant];
            constant++;
        }
        average = total / length;
        return average;
    }

    /**
     * Method to individually print out each of the numbers in the array
     *
     * @param array the array given to be printed out
     * @param length the length of the array
     */
    public static void ArrayPrinter(int[] array, int length) {
        int constant = 0;
        while (constant < length) {
            System.out.print(array[constant] + " ");
            constant++;
        }
    }
}
