package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.border.CompoundBorder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComputerTest {
    Computer test_computer;
    LapTop test_laptop;
    SmartPhone test_smartphone;

    @BeforeEach
    public void initComputer() {
        test_computer = new Computer("Dell", 32, .75);
        test_laptop = new LapTop("Omen", 17, 1, true);
        test_smartphone = new SmartPhone("Pixel", 5, .5, true);
    }

    @Test
    public void constructorSetsComputerValues() {

        assertEquals("Dell", test_computer.getBrand());
        assertEquals(32, test_computer.getScreenSize());
        assertEquals(.75, test_computer.getDataStorageInTB());
    }
    @Test
    public void constructorSetsLapTopValues() {
        assertEquals("Omen", test_laptop.getBrand());
        assertEquals(17, test_laptop.getScreenSize());
        assertEquals(1, test_laptop.getDataStorageInTB());
        assertEquals(true,test_laptop.isHasWifi());
    }
    @Test
    public void isHasWifiSetToTrue() {
        test_laptop.setHasWifi(false);
        test_laptop.connectToWifi();
        assertEquals(true,test_laptop.isHasWifi());

    }
    @Test
    public void isConnectedToANetworkSetToTrue() {
        test_smartphone.setConnectedToANetwork(false);
        test_smartphone.makeACall("314-757-9797");
        assertEquals(true, test_smartphone.isConnectedToANetwork());
    }
//    @Test
//    public void methodAddsNumbers() {
//        int result = test_laptop.canAddTwoNumbers(2,3);
//        assertEquals(5, result);
//    }
}
