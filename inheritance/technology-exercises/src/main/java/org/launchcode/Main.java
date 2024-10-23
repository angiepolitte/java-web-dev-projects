package org.launchcode;

public class Main {
    public static void main(String[] args) {
        SmartPhone mySmartPhone = new SmartPhone("Samsung", 6, .5, true);
        Computer myComputer = new Computer("HP", 27, 1);
        LapTop myLaptop = new LapTop("HP", 17, .5, true);

//        mySmartPhone.makeACall("314-321-2522");
//        myLaptop.connectToWifi();
//
//
//
//        System.out.println(myComputer.canAddTwoNumbers(5,9));
//        System.out.println(mySmartPhone.canAddTwoNumbers(1,2));
//        System.out.println(myLaptop.canAddTwoNumbers(3,4));
        System.out.println(mySmartPhone.getId());
        System.out.println(myLaptop.getId());
        System.out.println(myComputer.getId());

    }
}
