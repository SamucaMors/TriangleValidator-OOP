package entities;

import java.util.Scanner;

// Triangle class representing a triangle
public class Triangle {
    private String name;
    private double sideA, sideB, sideC;
    private double area;
    private Scanner scanner;

    // Constructor
    public Triangle(String name, Scanner scanner) {
        this.name = name;
        this.scanner = scanner;
    }

    // Getter for triangle name
    public String getName() {
        return name;
    }

    // Getter for area of triangle
    public double getArea() {
        return area;
    }

    // Method for processing the triangle
    public void processTriangle() {
        while (true) {
            System.out.printf("Enter the sides of triangle %s:%n", name);
            System.out.print("Side A: ");
            sideA = scanner.nextDouble();

            System.out.print("Side B: ");
            sideB = scanner.nextDouble();

            System.out.print("Side C: ");
            sideC = scanner.nextDouble();

            if (isValidTriangle()) {
                System.out.println("The values can form a triangle!");
                area = calculateArea();
                System.out.printf("Area of triangle %s: %.2f%n", name, area);
                break; // Sai do loop, pois os valores são válidos
            } else {
                System.out.println("The values cannot form a triangle. Please try again.");
            }
        }
    }

    // Method to check whether the sides form a triangle
    private boolean isValidTriangle() {
        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }

    // Method for calculating the area using Heron's formula
    private double calculateArea() {
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }
}