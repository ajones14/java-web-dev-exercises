package exercises.technology;

public class Computer {

    double screenSize;
    double cpuSpeed;
    double batteryLevel;

    public Computer(double screenSize, double cpuSpeed) {
        this.screenSize = screenSize;
        this.cpuSpeed = cpuSpeed;
        this.batteryLevel = 1.00;
    }

    public double decreaseBatteryLevel(double powerUsed) {
        this.batteryLevel -= powerUsed;
        if (this.batteryLevel < 0) {
            this.batteryLevel = 0;
        }
        return this.batteryLevel;
    }

    public double increaseBatteryLevel(double powerCharged) {
        this.batteryLevel += powerCharged;
        if (this.batteryLevel > 1.00) {
            this.batteryLevel = 1.00;
        }
        return this.batteryLevel;
    }

}
