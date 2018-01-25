package Chapter4;

import java.util.Scanner;

/**
 * Program to display what major a student has through given input.
 *
 * @author Alex Jasso
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mathF = "Mathematics Freshman";
        String mathSo = "Mathematics Sophomore";
        String mathJ = "Mathematics Junior";
        String mathSe = "Mathematics Senior";
        String compF = "Computer Science Freshman";
        String compSo = "Computer Science Sophomore";
        String compJ = "Computer Science Junior";
        String compSe = "Computer Science Senior";
        String infoF = "Information Technology Freshman";
        String infoSo = "Information Technology Sophomore";
        String infoJ = "Information Technology Junior";
        String infoSe = "Information Technology Senior";
        String m1 = "M1";
        String m2 = "M2";
        String m3 = "M3";
        String m4 = "M4";
        String c1 = "C1";
        String c2 = "C2";
        String c3 = "C3";
        String c4 = "C4";
        String i1 = "I1";
        String i2 = "I2";
        String i3 = "I3";
        String i4 = "I4";
        System.out.print("Enter two characters: ");
        String major = input.nextLine();
        if (major.equals(m1)) {
            System.out.println(mathF);
        } else if (major.equalsIgnoreCase(m2)) {
            System.out.println(mathSo);
        } else if (major.equalsIgnoreCase(m3)) {
            System.out.println(mathJ);
        } else if (major.equalsIgnoreCase(m4)) {
            System.out.println(mathSe);
        } else if (major.equalsIgnoreCase(c1)) {
            System.out.println(compF);
        } else if (major.equalsIgnoreCase(c2)) {
            System.out.println(compSo);
        } else if (major.equalsIgnoreCase(c3)) {
            System.out.println(compJ);
        } else if (major.equalsIgnoreCase(c4)) {
            System.out.println(compSe);
        } else if (major.equalsIgnoreCase(i1)) {
            System.out.println(infoF);
        } else if (major.equalsIgnoreCase(i2)) {
            System.out.println(infoSo);
        } else if (major.equalsIgnoreCase(i3)) {
            System.out.println(infoJ);
        } else if (major.equalsIgnoreCase(i4)) {
            System.out.println(infoSe);
        } else {
            System.out.println("Invalid input.");
        }
    }

}
