package Chapter3;

import java.util.Scanner;

/**
 * Program to report if you correctly or incorrectly guess if a coin lands on
 * heads or tails.
 *
 * @author Alex Jasso
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt.
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int random = (int) Math.random() * 2;
        System.out.println("Enter your guess (heads = 0, tails = 1): ");
        int guess = input.nextInt();
        if (guess == random) {
            System.out.println("You guessed correctly!");
        } else {
            System.out.println("You gave an incorrect guess.");
        }
    }

}
