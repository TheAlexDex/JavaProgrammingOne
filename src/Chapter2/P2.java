package Chapter2;

import java.util.Scanner;
import java.text.*;

/**
 * Program to compute a meal total.
 *
 * @author Alex Jasso
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.00");
        System.out.print("Please enter the prices of your meal, drink, and dessert: ");
        double meal = input.nextDouble();
        double drink = input.nextDouble();
        double dessert = input.nextDouble();
        double food = meal + drink + dessert;
        String food1 = decimal.format(food);
        double salesTax = food * .10;
        String salesTax1 = decimal.format(salesTax);
        double preTotal = food + salesTax;
        double tip = preTotal * 0.15;
        String tip1 = decimal.format(tip);
        double total = food + salesTax + tip;
        String total1 = decimal.format(total);
        System.out.println("Food: $" + food1);
        System.out.println("Sales Tax: $" + salesTax1);
        System.out.println("Tip: $" + tip1);
        System.out.println("Total: " + total1);
    }
}
