package Chapter4;

import java.util.Scanner;

/**
 * Program to print out the info for an employee.
 * 
 * @author Alex Jasso
 */
public class C4_23 {
	/**
     * Main Method
     * 
     * @param args arguments from command line prompt.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        double grossPay = hours * payRate;
        double federal = grossPay * federalTax;
        double state = grossPay * stateTax;
        double totalDeduction = federal + state;
        double netPay = grossPay - totalDeduction;
        System.out.println();
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: " + payRate);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Deductions: ");
        System.out.printf("    Federal Witholding : $%.2f", federal);
        System.out.printf("\n    State Withholding: $%.2f", state);
        System.out.printf("\n    Total Deduction: %.2f", totalDeduction);
        System.out.printf("\n Net Pay: %.2f", netPay);
    }

}
