package com.bridgelabz.task;

public class LineComparisonProgram {

    public static void main(String[] args) {
 
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

        // Calls the method to perform line modeling and length calculation
        performLineModeling();
    }

    // Method to perform line modeling and length calculation
    private static void performLineModeling() {
        
    	// Coordinates of the two points for UC-1
        double x1 = 1.0;
        double y1 = 2.0;
        double x2 = 4.0;
        double y2 = 6.0;

        System.out.println("Modeled Line: (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");

        double lineLength = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Length of the line: " + lineLength);
    }
}
