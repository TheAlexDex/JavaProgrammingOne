package Chapter7;

import java.util.Scanner;

/**
 * Program to display the minimum number from a given list.
 *
 * @author Alex Jasso
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        int constant = 0;
        System.out.print("Enter ten numbers: ");
        while (constant < 10) {
            double number = input.nextDouble();
            numbers[constant] = number;
            constant++;
        }
        double minimum = min(numbers);
        System.out.println("The minimum number is: " + minimum);
    }

    public static double min(double[] array) {
        double minimum = array[0];
        int constant = 0;
        while (constant < 10) {
            double number = array[constant];
            if (number < minimum) {
                minimum = number;
            }
            constant++;
        }
        return minimum;
    }
}
