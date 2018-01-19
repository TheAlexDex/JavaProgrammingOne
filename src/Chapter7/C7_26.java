package Chapter7;

import java.util.Scanner;

/**
 * Program to compare two given lists.
 *
 * @author Alex Jasso
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int constant1 = 0;
        int constant2 = 0;
        System.out.print("Enter list1: ");
        int length1 = input.nextInt();
        int[] list1 = new int[length1];
        while (constant1 < length1) {
            int number = input.nextInt();
            list1[constant1] = number;
            constant1++;
        }
        System.out.print("Enter list2: ");
        int length2 = input.nextInt();
        int[] list2 = new int[length2];
        while (constant2 < length2) {
            int number = input.nextInt();
            list2[constant2] = number;
            constant2++;
        }
        boolean answer = equals(list1, list2, length1, length2);
        if (answer == true) {
            System.out.println("Two lists are strictly identical.");
        } else {
            System.out.println("Two lists are not strictly identical.");
        }
    }

    public static boolean equals(int[] list1, int[] list2, int length1, int length2) {
        boolean answer = false;
        int constant = 0;
        if (length1 == length2) {
            while (constant < length1) {
                int number1 = list1[constant];
                int number2 = list2[constant];
                if (number1 != number2) {
                    return answer;
                } else {
                    constant++;
                }
            }
        } else {
            return answer;
        }
        answer = true;
        return answer;
    }
}
