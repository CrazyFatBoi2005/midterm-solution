package midterm;

public class Thermostat implements SmartDevice{
    private String name;

    public Thermostat(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " is now heating/cooling.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " is now OFF.");
    }
}
