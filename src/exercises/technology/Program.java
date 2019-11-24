package exercises.technology;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class Program {
    Laptop laptop;
    SmartPhone smartPhone;
    Computer computer;

    @Before
    public void setup() {
        laptop = new Laptop(13, 2.5, "Windows 10");
        smartPhone = new SmartPhone(3.5, 3.0);
        computer = new Computer(16, 4.0);
    }

    @Test
    public void laptopBatteryLevelSetWithConstructor() {
        assertTrue(laptop.batteryLevel == 1.00);
    }

    @Test
    public void laptopOperatingSystemSetWithConstructor() {
        assertTrue(laptop.operatingSystem == "Windows 10");
    }

    @Test
    public void laptopInstallOperatingSystemTest() {
        laptop.installOperatingSystem("Windows 11");
        assertTrue(laptop.operatingSystem == "Windows 11");
    }

    @Test
    public void smartPhoneBatteryLevelSetWithConstructor() {
        assertTrue(smartPhone.batteryLevel == 1.0);
    }

    @Test
    public void smartPhoneUninstallApp() {
        smartPhone.unInstallApp("Calendar");
        assertFalse(smartPhone.apps.contains("Calendar"));
    }

    @Test
    public void smartPhoneInstallApp() {
        smartPhone.installApp("Facebook");
        assertTrue(smartPhone.apps.contains("Facebook"));
    }

    @Test
    public void computerValuesSetByConstructor() {
        assertTrue(computer.screenSize == 16);
        assertTrue(computer.cpuSpeed == 4.0);
        assertTrue(computer.batteryLevel == 1.0);
    }

    @Test
    public void computerDecreaseBatteryLevel() {
        assertTrue(computer.decreaseBatteryLevel(0.45) == 0.55);
    }

    @Test
    public void computerDecreaseBatteryLevelStopsAtZero() {
        assertTrue(computer.decreaseBatteryLevel(1.1) == 0);
    }

    @Test
    public void computerIncreaseBatteryLevel() {
        computer.decreaseBatteryLevel(0.5);
        assertTrue(computer.increaseBatteryLevel(0.1) == 0.6);
    }

    @Test
    public void computerIncreaseBatteryLevelStopsAt1() {
        assertTrue(computer.increaseBatteryLevel(0.5) == 1);
    }

}
