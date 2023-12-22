package com.bridgelabz.linecomparison;

import java.util.Objects;

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation.");

        // Coordinates of the first point for Line 1
        double x1Line1 = 1.0;
        double y1Line1 = 2.0;
        double x2Line1 = 4.0;
        double y2Line1 = 6.0;

        // Coordinates of the first point for Line 2
        double x1Line2 = 1.0;
        double y1Line2 = 2.0;
        double x2Line2 = 4.0;
        double y2Line2 = 6.0;

        // Calculate the length of Line 1 and Line 2
        double lineLength1 = calculateLineLength(x1Line1, y1Line1, x2Line1, y2Line1);
        double lineLength2 = calculateLineLength(x1Line2, y1Line2, x2Line2, y2Line2);

        System.out.println("Length of Line 1: " + lineLength1);
        System.out.println("Length of Line 2: " + lineLength2);

        // Check equality of Line 1 and Line 2
        if (isEqual(lineLength1, lineLength2)) {
            System.out.println("Both lines are equal.");
        } else {
            System.out.println("Lines are not equal.");
        }
    }

    // Function to calculate the length of a line
    private static double calculateLineLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Function to check equality of two lengths
    private static boolean isEqual(double length1, double length2) {
        // Using Objects.equals to handle NaN cases
        return Objects.equals(length1, length2);
    }
}
