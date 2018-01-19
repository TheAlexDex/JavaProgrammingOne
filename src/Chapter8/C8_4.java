package Chapter8;

import java.util.*;

/**
 * Program to display a certain output.
 *
 * @author Alex Jasso
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int constant1 = 0;
        int constant2 = 0;
        int constant3 = 0;
        int total = 0;
        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9},};
        int[] totals = new int[8];
        System.out.println();
        System.out.println("              Su  M   T   W   Th  F   Sa  Total");
        while (constant1 < 8) {
            System.out.print("Employee" + constant1 + "     ");
            while (constant2 < 7) {
                System.out.print(hours[constant3][constant2] + "   ");
                constant2++;
            }
            for (int x = 0; x < 7; x++) {
                total += hours[constant1][x];
            }
            System.out.print(total);
            totals[constant1] = total;
            total = 0;
            System.out.println();
            constant2 = 0;
            constant3++;
            constant1++;
        }

        //Extra Credit
        int[] totals2 = new int[8];
        System.arraycopy(totals, 0, totals2, 0, totals.length);
        Arrays.sort(totals);
        int number = 0;
        int checker = 0;
        int tally = 0;
        System.out.println();
        for (int x = 7; x > -1; x--) {
            number = totals[x];
            while (totals2[checker] != number) {
                checker++;
            }
            if (tally == 1) {
                System.out.println("Employee 5: " + number);
                tally++;
                continue;
            }
            if (checker == 1) {
                tally++;
            }
            System.out.println("Employee " + checker + ": " + number);
            checker = 0;
        }
    }
}
