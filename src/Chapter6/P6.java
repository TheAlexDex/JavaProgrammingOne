package Chapter6;

import java.util.Scanner;
import java.text.*;

/**
 * Program to convert user given amounts of money into different currencies.
 *
 * @author Alex Jasso
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.00");
        String answer = "Yes";
        String euroConversion = "";
        String poundConversion = "";
        String yenConversion = "";
        System.out.print("Please enter how many Euros a dollar will buy: ");
        double euros = input.nextDouble();
        System.out.print("Now please enter how many Pound Sterling a dollar will buy: ");
        double pounds = input.nextDouble();
        System.out.print("Finally, please enter how many Yen a dollar will buy: ");
        double yen = input.nextDouble();
        System.out.print("Please enter the number of of dollars. ");
        double dollars = input.nextDouble();
        String dollar = decimal.format(dollars);
        System.out.print("Now enter 'E' to buy Euros, 'P' to buy Pounds, or 'Y' to buy Yen. ");
        String currency = input.next();
        if (currency.equals("E") || currency.equals("e")) {
            euroConversion = CurrencyConverter(dollars, euros);
            System.out.println("$" + dollar + " will get you " + euroConversion + " Euros.");
        } else if (currency.equals("P") || currency.equals("p")) {
            poundConversion = CurrencyConverter(dollars, pounds);
            System.out.println("$" + dollar + " will get you " + poundConversion + " Pound Sterling.");
        } else if (currency.equals("Y") || currency.equals("y")) {
            yenConversion = CurrencyConverter(dollars, yen);
            System.out.println("$" + dollar + " will get you " + yenConversion + " Yen.");
        }
        System.out.print("Do you have more conversions to convert? ");
        answer = input.next();
        answer = answer.toLowerCase();
        while (!answer.equals("no")) {
            if (!answer.equals("yes")) {
                System.out.print("Enter yes to continue or no to stop. ");
                answer = input.next();
                answer = answer.toLowerCase();
            }
            if (answer.equals("yes")) {
                System.out.print("Please enter the number of of dollars. ");
                dollars = input.nextDouble();
                System.out.print("Now enter 'E' to buy Euros, 'P' to buy Pounds, or 'Y' to buy Yen. ");
                currency = input.next();
                if (currency.equals("E") || currency.equals("e")) {
                    euroConversion = CurrencyConverter(dollars, euros);
                    System.out.println("$" + dollars + " will get you " + euroConversion + " Euros.");
                } else if (currency.equals("P") || currency.equals("p")) {
                    poundConversion = CurrencyConverter(dollars, pounds);
                    System.out.println("$" + dollars + " will get you " + poundConversion + " Pound Sterling.");
                } else if (currency.equals("Y") || currency.equals("y")) {
                    yenConversion = CurrencyConverter(dollars, yen);
                    System.out.println("$" + dollars + " will get you " + yenConversion + " Yen.");
                }
                System.out.print("Do you have more conversions to convert? ");
                answer = input.next();
                answer = answer.toLowerCase();
            }
        }
    }

    /**
     * Method to convert the money amount given by a given exchange rate.
     *
     * @param dollars the user given amount of money to be converted
     * @param exchangeRate a set rate of exchange that will be used in
     * conjunction with the dollars parameter
     * @return the amount of money converted as a string
     */
    public static String CurrencyConverter(double dollars, double exchangeRate) {
        DecimalFormat decimal = new DecimalFormat("#.00");
        double conversion = 0;
        conversion = dollars * exchangeRate;
        if (dollars >= 100) {
            conversion = conversion - (conversion * 0.05);
        } else if (dollars <= 100) {
            conversion = conversion - (conversion * 0.1);
        } else if (dollars == 1000) {
            dollars = dollars - 50;
            conversion = dollars * exchangeRate;
        }
        String conversionStr = decimal.format(conversion);
        return conversionStr;
    }
}
