package Chapter2;

import java.util.Scanner;
import java.text.*;

/**
 * Program to find a cylinder's area and volume using user input.
 *
 * @author Alex Jasso
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.00");
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * 3.14159;
        String areaS = decimal.format(area);
        double volume = area * length;
        String volumeS = decimal.format(volume);
        System.out.println("The area is: " + areaS);
        System.out.println("The voulme is: " + volumeS);
    }

}
