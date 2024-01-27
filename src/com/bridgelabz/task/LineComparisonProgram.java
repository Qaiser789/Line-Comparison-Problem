package com.bridgelabz.task;

public class LineComparisonProgram {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
 
        performLineModeling();
  
        performLineEqualityCheck();

        performLineComparison();
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

    // Method to perform line equality check 
    private static void performLineEqualityCheck() {
        // Coordinates of the two points for Line 1
        double x1Line1 = 1.0;
        double y1Line1 = 2.0;
        double x2Line1 = 4.0;
        double y2Line1 = 6.0;

        // Coordinates of the two points for Line 2 (make them equal to Line 1 for testing equality)
        double x1Line2 = 1.0;
        double y1Line2 = 2.0;
        double x2Line2 = 4.0;
        double y2Line2 = 6.0;

        boolean linesAreEqual = areLinesEqual(x1Line1, y1Line1, x2Line1, y2Line1, x1Line2, y1Line2, x2Line2, y2Line2);

        System.out.println("Are the lines equal? " + linesAreEqual);
    }

    // Method to check equality of two lines
    private static boolean areLinesEqual(double x1Line1, double y1Line1, double x2Line1, double y2Line1,
                                         double x1Line2, double y1Line2, double x2Line2, double y2Line2) {
        // Check equality using the equals method
        return new Line(x1Line1, y1Line1, x2Line1, y2Line1).equals(new Line(x1Line2, y1Line2, x2Line2, y2Line2));
    }

    // Method to perform line comparison 
    private static void performLineComparison() {
        // Coordinates of the two points for Line 1
        double x1Line1 = 1.0;
        double y1Line1 = 2.0;
        double x2Line1 = 4.0;
        double y2Line1 = 6.0;

        // Coordinates of the two points for Line 2 (make them greater than Line 1 for testing comparison)
        double x1Line2 = 2.0;
        double y1Line2 = 4.0;
        double x2Line2 = 6.0;
        double y2Line2 = 8.0;

        int comparisonResult = compareLines(x1Line1, y1Line1, x2Line1, y2Line1, x1Line2, y1Line2, x2Line2, y2Line2);

        System.out.println("Line 1 compared to Line 2: " + getComparisonResultString(comparisonResult));
    }

    // Method to compare two lines using the compareTo method
    private static int compareLines(double x1Line1, double y1Line1, double x2Line1, double y2Line1,
                                    double x1Line2, double y1Line2, double x2Line2, double y2Line2) {
        // Compare lines using the compareTo method
        return new Line(x1Line1, y1Line1, x2Line1, y2Line1).compareTo(new Line(x1Line2, y1Line2, x2Line2, y2Line2));
    }

    // Method to convert comparison result to a string for display
    private static String getComparisonResultString(int comparisonResult) {
        if (comparisonResult < 0) {
            return "Line 1 is less than Line 2";
        } else if (comparisonResult > 0) {
            return "Line 1 is greater than Line 2";
        } else {
            return "Line 1 is equal to Line 2";
        }
    }

    // Inner class representing a Line
    private static class Line implements Comparable<Line> {
        double x1, y1, x2, y2;

        public Line(double x1, double y1, double x2, double y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Line line = (Line) obj;
            return Double.compare(line.x1, x1) == 0 &&
                    Double.compare(line.y1, y1) == 0 &&
                    Double.compare(line.x2, x2) == 0 &&
                    Double.compare(line.y2, y2) == 0;
        }

        @Override
        public int compareTo(Line otherLine) {
            // Compare lines based on their lengths
            double lengthThisLine = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double lengthOtherLine = Math.sqrt(Math.pow(otherLine.x2 - otherLine.x1, 2) + Math.pow(otherLine.y2 - otherLine.y1, 2));

            return Double.compare(lengthThisLine, lengthOtherLine);
        }
    }
}