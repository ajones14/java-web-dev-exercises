package org.launchcode.java.studios.areaofcircle;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of your circle:");
        String userInput = input.nextLine();
        if (userInput.equals("")) {
            System.out.println("Please enter a number!");
            System.exit(0);
        } else {
            double radius = Double.parseDouble(userInput);
            while (radius < 0) {
                System.out.println("Please enter a positive number!");
                System.out.println("Enter the radius of your circle:");
                radius = input.nextDouble();
            }
            input.close();
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        }

    }

}
