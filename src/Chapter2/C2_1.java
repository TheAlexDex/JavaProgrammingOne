package Chapter2;

import java.util.Scanner;

/**
 * Program to take the user's Celsius degree and convert it into a Fahrenheit
 * degree.
 *
 * @author Alex Jasso
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double constant = 9 / 5.0;
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        double fahr = constant * celsius + 32;
        System.out.println(+celsius + " Celsius is " + fahr + " Fahrenheit.");
    }
}
