package org.launchcode;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        if (radius > 0) {
            System.out.println("The area of a circle with radius " + radius + " is " + Circle.getArea(radius));
        } else {
            System.out.println("Please enter a positive number");

        }


    }
}
