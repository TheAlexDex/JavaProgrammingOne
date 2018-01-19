package Chapter7;

import java.util.Scanner;

/**
 * Program to display the letter grades for students.
 *
 * @author Alex Jasso
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        int constant1 = 0;
        int constant2 = 0;
        int constant3 = 0;
        int constant4 = 0;
        int grades[] = new int[students];
        String letters[] = new String[students];
        System.out.print("Enter " + students + " scores: ");
        while (constant1 < students) {
            int grade = input.nextInt();
            grades[constant1] = grade;
            constant1++;
        }
        int highest = 0;
        int number1 = 0;
        while (constant2 < students) {
            number1 = grades[constant2];
            if (number1 > highest) {
                highest = number1;
            }
            constant2++;
        }
        int number2 = 0;
        while (constant3 < students) {
            number2 = grades[constant3];
            if (number2 >= (highest - 10)) {
                letters[constant3] = "A";
            } else if (number2 >= (highest - 20) && number2 < (highest - 10)) {
                letters[constant3] = "B";
            } else if (number2 >= (highest - 30) && number2 < (highest - 20)) {
                letters[constant3] = "C";
            } else if (number2 >= (highest - 40) && number2 < (highest - 30)) {
                letters[constant3] = "D";
            } else {
                letters[constant3] = "F";
            }
            constant3++;
        }
        while (constant4 < students) {
            System.out.println("Student " + constant4 + "'s score is " + grades[constant4] + " and grade is " + letters[constant4]);
            constant4++;
        }
    }
}
