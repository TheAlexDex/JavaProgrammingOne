package Chapter2;

import java.util.Scanner;

/**
 * Program to find a total using a subtotal and gratuity rate.
 *
 * @author Alex Jasso
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        gratuity = gratuity / 10;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }
}
