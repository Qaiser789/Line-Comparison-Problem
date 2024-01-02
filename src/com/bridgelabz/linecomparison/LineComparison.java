package com.bridgelabz.linecomparison;

import java.util.Objects;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods for x and y
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Override equals method for Point class
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    // Override hashCode method for Point class
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    // Getter methods for startPoint and endPoint
    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    // Calculate the length of the line using the distance formula
    public double calculateLength() {
        double x1 = startPoint.getX();
        double y1 = startPoint.getY();
        double x2 = endPoint.getX();
        double y2 = endPoint.getY();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Override compareTo method for Line class
    public int compareTo(Line other) {
        return Double.compare(this.calculateLength(), other.calculateLength());
    }
}

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation.");

        // Creating points
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(4.0, 6.0);

        // Creating lines using points
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(new Point(1.0, 2.0), new Point(4.0, 6.0));

        // Calculate the length of Line 1 and Line 2
        double lineLength1 = line1.calculateLength();
        double lineLength2 = line2.calculateLength();

        System.out.println("Length of Line 1: " + lineLength1);
        System.out.println("Length of Line 2: " + lineLength2);

        // Compare the lengths using compareTo
        int result = line1.compareTo(line2);

        // Print the result based on the comparison
        if (result == 0) {
            System.out.println("Both lines are equal.");
        } else if (result > 0) {
            System.out.println("Line 1 is greater than Line 2.");
        } else {
            System.out.println("Line 1 is less than Line 2.");
        }
    }
}
