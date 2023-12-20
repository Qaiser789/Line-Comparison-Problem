package com.bridgelabz.linecomparison;

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation.");

        // Coordinates of the first point (x1, y1)
        double x1 = 1.0;
        double y1 = 2.0;

        // Coordinates of the second point (x2, y2)
        double x2 = 4.0;
        double y2 = 6.0;

        // Calculate the length of the line
        double lineLength = calculateLineLength(x1, y1, x2, y2);

        System.out.println("Length of the line: " + lineLength);
    }

    // Function to calculate the length of a line
    private static double calculateLineLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
