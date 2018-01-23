package Chapter4;

import java.util.Scanner;
import java.text.*;

/**
 * Program to print out the info for an employee.
 *
 * @author Alex Jasso
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.00");
        System.out.println("First Bidder");
        System.out.print("Enter your name: ");
        String bidder1 = input.nextLine();
        System.out.print("Enter how many hours of work you will require: ");
        int hours1 = input.nextInt();
        System.out.print("Enter how much you charge per hour: ");
        double charge1 = input.nextDouble();
        String charge10 = decimal.format(charge1);
        System.out.println();
        System.out.println("Second Bidder");
        System.out.print("Enter your name: ");
        String bidder2 = input.next();
        System.out.print("Enter how many hours of work you will require: ");
        int hours2 = input.nextInt();
        System.out.print("Enter how much you charge per hour: ");
        double charge2 = input.nextDouble();
        String charge20 = decimal.format(charge2);
        double cost1 = hours1 * charge1;
        String cost10 = decimal.format(cost1);
        double cost2 = hours2 * charge2;
        String cost20 = decimal.format(cost2);
        if (cost1 < cost2) {
            System.out.println("The winner is " + bidder1 + "!");
            System.out.println("Total Cost: $" + cost10);
        } else if (cost1 > cost2) {
            System.out.println("The winner is " + bidder2 + "!");
            System.out.println("Total Cost: $" + cost20);
        } else if (cost1 == cost2) {
            if (hours1 < hours2) {
                System.out.println("The winner is " + bidder1 + "!");
                System.out.println("Total Cost: $" + cost10);
                System.out.println("Hours Required: " + hours1);
            } else if (hours1 > hours2) {
                System.out.println("The winner is " + bidder2 + "!");
                System.out.println("Total Cost: $" + cost20);
                System.out.println("Hours Required:" + hours2);
            } else if (hours1 == hours2) {
                System.out.println(bidder1 + " and " + bidder2 + " have the same bids!");
                System.out.println(bidder1 + ":");
                System.out.println("    Hours Required: " + hours1);
                System.out.println("    Cost per Hours: $" + charge10);
                System.out.println("    Total Cost: $" + cost10);
                System.out.println(bidder2 + ":");
                System.out.println("    Hours Required: " + hours2);
                System.out.println("    Cost per Hours: $" + charge20);
                System.out.println("    Total Cost: $" + cost20);
            }
        }
    }
}
