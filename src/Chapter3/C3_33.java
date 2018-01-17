package Chapter3;

import java.util.Scanner;

/**
 * Program to state if package 1 and/or package 2 has the best price.
 *
 * @author Alex Jasso
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight and the price for Package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print("Enter the weight and the price for Package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        double package1 = price1 / weight1;
        double package2 = price2 / weight2;
        if (package1 < package2) {
            System.out.println("Package 1 has a better price.");
        } else if (package1 == package2) {
            System.out.println("Package 1 and Package 2 have the same price.");
        } else {
            System.out.println("Package 2 has a better price.");
        }
    }

}
