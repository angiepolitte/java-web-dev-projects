package org.launchcode;

public class SmartPhone extends Computer {


//    class variables
    private boolean isConnectedToANetwork = true;

//    constructor
public SmartPhone(String brand, int screenSize, double dataStorageInTB, boolean isConnectedToANetwork) {
    super(brand, screenSize, dataStorageInTB);
    this.isConnectedToANetwork = isConnectedToANetwork;
}
//getter
    public boolean isConnectedToANetwork() {
        return isConnectedToANetwork;
    }
//    setter


    public void setConnectedToANetwork(boolean connectedToANetwork) {
        isConnectedToANetwork = connectedToANetwork;
    }

    //method
    public void makeACall(String phoneNumber) {
    this.isConnectedToANetwork = true;
        System.out.println("Calling: " + phoneNumber + "\nCan you hear me now?");
    }

}
