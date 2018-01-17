package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse a given string.
 * 
 * @author Alex Jasso
 */
public class C5_46 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reverse = "";
        System.out.print("Enter a string: ");
        String line = input.nextLine();
        int lineLength = line.length();
        int constant = lineLength - 1;
        while (constant != -1) {
            String letter = line.substring(constant, lineLength);
            reverse = reverse + letter;
            lineLength--;
            constant--;
        }
        System.out.println("The reversed string is " + reverse);
    }
}
