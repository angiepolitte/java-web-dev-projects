package org.launchcode;

public class LapTop extends Computer {

//    class variables
    private boolean hasWifi;

//    contructors
    public LapTop(String brand, int screenSize, double dataStorageInTB) {
        super(brand, screenSize, dataStorageInTB);
//        added field
        this.hasWifi = true;
    }
    public LapTop(String brand, int screenSize, double dataStorageInTB, boolean hasWifi) {
        super(brand, screenSize, dataStorageInTB);
        this.hasWifi = hasWifi;
    }
//getters so we can access it in tests and other places
    public boolean isHasWifi() {
        return this.hasWifi;
    }
//    setter


    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    //    method
    public void connectToWifi() {
        this.hasWifi = true;
        System.out.println("Connected to Wifi");
    }
}
