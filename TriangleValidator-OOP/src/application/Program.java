package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        // Creating and processing the Triangle "X"
        Triangle triangleX = new Triangle("X", read);
        triangleX.processTriangle();

        // Creating and processing the Triangle "Y"
        Triangle triangleY = new Triangle("Y", read);
        triangleY.processTriangle();

        // Comparing the areas
        compareAreas(triangleX, triangleY);

        read.close();
    }

    // Method for comparing the areas of two triangles
    public static void compareAreas(Triangle triangleX, Triangle triangleY) {
        if (triangleX.getArea() > triangleY.getArea()) {
            System.out.printf("Area of the triangle %s is greater than Area %s.%n", triangleX.getName(), triangleY.getName());
        } else if (triangleX.getArea() < triangleY.getArea()) {
            System.out.printf("Area of the triangle %s is greater than Area %s.%n", triangleY.getName(), triangleX.getName());
        } else {
            System.out.println("Both areas are equal.");
        }
    }
}