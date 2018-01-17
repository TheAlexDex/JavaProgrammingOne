package Chapter3;

import java.util.Scanner;

/**
 * Program to answer questions about if a given number is divisible by 5 or 6.
 *
 * @author Alex Jasso
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean and, or, notBoth;
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int and5 = number % 5;
        int and6 = number % 6;
        if (and5 == 0 && and6 == 0) {
            and = true;
        } else {
            and = false;
        }
        if (and5 == 0 || and6 == 0) {
            or = true;
        } else {
            or = false;
        }
        if (and5 == 0 ^ and6 == 0) {
            notBoth = true;
        } else {
            notBoth = false;
        }
        System.out.println("Is " + number + " divisible by 5 and 6? " + and);
        System.out.println("Is " + number + " divisible by 5 or 6? " + or);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + notBoth);
    }

}
