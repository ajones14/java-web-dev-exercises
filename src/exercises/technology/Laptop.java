package exercises.technology;

public class Laptop extends Computer {

    String operatingSystem;

    public Laptop(double screenSize, double cpuSpeed, String operatingSystem) {
        super(screenSize, cpuSpeed);
        this.operatingSystem = operatingSystem;
    }

    public void installOperatingSystem(String newOS) {
        this.operatingSystem = newOS;
    }

}
