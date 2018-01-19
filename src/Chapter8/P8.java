package Chapter8;

import java.util.Scanner;
import java.lang.*;

/**
 * Program to ask for salesman information and then later display it.
 *
 * @author Alex Jasso
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String salesman;
        String day;
        double sale;
        String answer;
        String number;
        int number1 = 0;
        int number2 = 0;
        double[][] totalSales = new double[4][5];
        System.out.print("Enter the salesman ID as A, B, C, or D. ");
        salesman = input.next();
        while (!salesman.equalsIgnoreCase("A") && !salesman.equalsIgnoreCase("B") && !salesman.equalsIgnoreCase("C") && !salesman.equalsIgnoreCase("D")) {
            System.out.print("Wrong input. Please enter the correct salesman ID: ");
            salesman = input.next();
        }
        if (salesman.equalsIgnoreCase("B")) {
            number1 = 1;
        } else if (salesman.equalsIgnoreCase("C")) {
            number1 = 2;
        } else if (salesman.equalsIgnoreCase("D")) {
            number1 = 3;
        }
        System.out.print("Enter the day as M, T, W, H, or F. ");
        day = input.next();
        while (!day.equalsIgnoreCase("M") && !day.equalsIgnoreCase("T") && !day.equalsIgnoreCase("W") && !day.equalsIgnoreCase("H") && !day.equalsIgnoreCase("F")) {
            System.out.print("Wrong input. Please enter the correct day: ");
            day = input.next();
        }
        if (day.equalsIgnoreCase("T")) {
            number2 = 1;
        } else if (day.equalsIgnoreCase("W")) {
            number2 = 2;
        } else if (day.equalsIgnoreCase("H")) {
            number2 = 3;
        } else if (day.equalsIgnoreCase("F")) {
            number2 = 4;
        }
        System.out.print("Enter the amount of the sale: ");
        number = input.next();
        for (int x = 0; x < number.length(); x++) {
            if (Character.isLetter(number.charAt(x)) == true) {
                System.out.print("Wrong input. Enter a number: ");
                number = input.next();
                x = -1;
            }
        }
        sale = Double.parseDouble(number);
        totalSales[number1][number2] += sale;
        System.out.print("More data? Enter Y for more or N to stop.");
        answer = input.next();
        while (!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N")) {
            System.out.print("Wrong input. Now enter Y for more or N to stop.");
            answer = input.next();
        }
        while (answer.equalsIgnoreCase("Y")) {
            System.out.print("Enter the salesman ID as A, B, C, or D. ");
            salesman = input.next();
            while (!salesman.equalsIgnoreCase("A") && !salesman.equalsIgnoreCase("B") && !salesman.equalsIgnoreCase("C") && !salesman.equalsIgnoreCase("D")) {
                System.out.print("Wrong input. Please enter the salesman ID: ");
                salesman = input.next();
            }
            if (salesman.equalsIgnoreCase("A")) {
                number1 = 0;
            } else if (salesman.equalsIgnoreCase("B")) {
                number1 = 1;
            } else if (salesman.equalsIgnoreCase("C")) {
                number1 = 2;
            } else if (salesman.equalsIgnoreCase("D")) {
                number1 = 3;
            }
            System.out.print("Enter the day as M, T, W, H, or F. ");
            day = input.next();
            while (!day.equalsIgnoreCase("M") && !day.equalsIgnoreCase("T") && !day.equalsIgnoreCase("W") && !day.equalsIgnoreCase("H") && !day.equalsIgnoreCase("F")) {
                System.out.print("Wrong input. Please enter the correct day: ");
                day = input.next();
            }
            if (day.equalsIgnoreCase("M")) {
                number2 = 0;
            } else if (day.equalsIgnoreCase("T")) {
                number2 = 1;
            } else if (day.equalsIgnoreCase("W")) {
                number2 = 2;
            } else if (day.equalsIgnoreCase("H")) {
                number2 = 3;
            } else if (day.equalsIgnoreCase("F")) {
                number2 = 4;
            }
            System.out.print("Enter the amount of the sale: ");
            number = input.next();
            for (int x = 0; x < number.length(); x++) {
                if (Character.isLetter(number.charAt(x)) == true) {
                    System.out.print("Wrong input. Enter a number: ");
                    number = input.next();
                    x = -1;
                }
            }
            sale = Double.parseDouble(number);
            totalSales[number1][number2] += sale;
            System.out.print("More data? Enter Y for more or N to stop.");
            answer = input.next();
            while (!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N")) {
                System.out.print("Wrong input. Now enter Y for more or N to stop.");
                answer = input.next();
            }
        }
        System.out.println();
        System.out.println("Salesman    M    T    W    H    F");
        System.out.print("       A  ");
        for (int a = 0; a < 5; a++) {
            System.out.print(totalSales[0][a] + "  ");
        }
        System.out.println();
        System.out.print("       B  ");
        for (int b = 0; b < 5; b++) {
            System.out.print(totalSales[1][b] + "  ");
        }
        System.out.println();
        System.out.print("       C  ");
        for (int c = 0; c < 5; c++) {
            System.out.print(totalSales[2][c] + "  ");
        }
        System.out.println();
        System.out.print("       D  ");
        for (int d = 0; d < 5; d++) {
            System.out.print(totalSales[3][d] + "  ");
        }
    }
}
