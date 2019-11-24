package exercises.technology;

import java.util.ArrayList;

public class SmartPhone extends Computer{

    ArrayList<String> apps = new ArrayList<>();

    public SmartPhone(double screenSize, double cpuSpeed) {
        super(screenSize, cpuSpeed);
        this.apps.add("Calculator");
        this.apps.add("Camera");
        this.apps.add("Gallery");
        this.apps.add("Browser");
        this.apps.add("Calendar");
    }

    public boolean unInstallApp(String app) {
        return this.apps.remove(app);
    }

    public boolean installApp(String app) {
        return this.apps.add(app);
    }

}
