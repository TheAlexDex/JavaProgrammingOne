package Chapter5;

import java.util.Scanner;

/**
 * Program to ask for input and return if the user won, lost, or tied in a game of Rock, Paper, Scissors.
 * 
 * @author Alex Jasso
 */
public class C5_34 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int comWins = 0;
        int userWins = 0;
        while (comWins != 2 && userWins != 2) {
            int random = (int) (Math.random() * 3);
            System.out.print("Enter either Rock(0), Paper(1), or Scissors(2): ");
            int choice = input.nextInt();
            if (choice == 0 && random == 1) {
                System.out.println("Paper beats rock. You lose.");
                System.out.println("");
                comWins++;
            } else if (choice == 0 && random == 2) {
                System.out.println("Rock beats scissors. You win!");
                System.out.println("");
                userWins++;
            }
            if (choice == 1 && random == 0) {
                System.out.println("Paper beats rock. You win!");
                System.out.println("");
                userWins++;
            } else if (choice == 1 && random == 2) {
                System.out.println("Scissors beats paper. You lose.");
                System.out.println("");
                comWins++;
            }
            if (choice == 2 && random == 0) {
                System.out.println("Rock beats scissors. You lose.");
                System.out.println("");
                comWins++;
            } else if (choice == 2 && random == 1) {
                System.out.println("Scissors beats paper. You win!");
                System.out.println("");
                userWins++;
            }
            if (choice == random) {
                System.out.println("TIE!");
                System.out.println("");
            }
        }
        if (userWins == 2) {
            System.out.println("User Wins: " + userWins);
            System.out.println("Computer Wins: " + comWins);
            System.out.println("You win the game! Congratulations!");
        } else if (comWins == 2) {
            System.out.println("User Wins: " + userWins);
            System.out.println("Computer Wins: " + comWins);
            System.out.println("You lost the game. Try again next time.");
        }
    }
}
