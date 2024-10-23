package org.launchcode;

public class Computer extends AbstractEntity {

    //  fields/properties
    private String brand;
    private int screenSize;
    private double dataStorageInTB;


    //  contructor
    public Computer(String brand, int screenSize, double dataStorageInTB) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.dataStorageInTB = dataStorageInTB;
    }

    //  getters
    public String getBrand() {
        return brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public double getDataStorageInTB() {
        return dataStorageInTB;
    }

    //    methods
    public int canAddTwoNumbers(int a, int b) {
        return a + b;
    }

    public void tellMeAJoke() {
        System.out.println("Why did my computer show up to work late? It had a hard drive.");
    }
}
