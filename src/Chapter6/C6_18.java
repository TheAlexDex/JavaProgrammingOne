package Chapter6;

import java.util.Scanner;

/**
 * Program to check if a password given is valid or not.
 *
 * @author Alex Jasso
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter what you will use as your password: ");
        String password = input.nextLine();
        String message = PasswordChecker(password);
        System.out.println(message);
    }

    /**
     * Method to check a user given password.
     *
     * @param password string to be revised
     * @return returns a message as a string
     */
    public static String PasswordChecker(String password) {
        int length = password.length();
        int numTotal = 0;
        int letterTotal = 0;
        int constant = length - 1;
        String output;
        char character;
        if (length < 8) {
            output = "Invalid Password";
            constant = -1;
        }
        while (constant > -1) {
            character = password.charAt(constant);
            if (Character.isLetter(character) == true) {
                letterTotal++;
            } else if (Character.isDigit(character) == true) {
                numTotal++;
            } else {
                return output = "Invalid Password";
            }
            constant--;
        }
        if (letterTotal + numTotal != length) {
            return output = "Invalid Password.";
        }
        if (numTotal < 2) {
            output = "Invalid Password";
        } else {
            output = "Valid Password";
        }
        return output;
    }
}
