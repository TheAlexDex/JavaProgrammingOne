package Chapter5;

import java.util.Scanner;

/**
 * Program to count up votes and to later show the amounts of votes when the user states that there is no more votes to add.
 * 
 * @author Alex Jasso
 */
public class P5 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letter;
        int yVotes = 0;
        int nVotes = 0;
        System.out.print("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting. ");
        letter = input.nextLine();
        while (!letter.equalsIgnoreCase("Q")) {
            if (letter.equalsIgnoreCase("Y")) {
                yVotes++;
                System.out.print("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting. ");
                letter = input.nextLine();
            } else if (letter.equalsIgnoreCase("N")) {
                nVotes++;
                System.out.print("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting. ");
                letter = input.nextLine();
            } else {
                System.out.print("INVALID CODE: Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting. ");
                letter = input.nextLine();
            }
        }
        System.out.println("Number of Yes votes: " + yVotes);
        System.out.println("Number of No votes:" + nVotes);
    }
}
