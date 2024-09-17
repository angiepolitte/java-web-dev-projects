package org.launchcode;

import java.util.Scanner;

public class Miles {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is number of miles you have driven:");
    Integer numMiles = input.nextInt();
    System.out.println("What is number of gallons you have consumed:");
    Integer numGallons = input.nextInt();
    input.close();

    Integer milesPerGallon = numMiles / numGallons;
    System.out.println("Your miles-per-gallon is " + milesPerGallon + " mpg.");
}
}
