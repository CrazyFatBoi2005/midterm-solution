package midterm;

public class BasicSmartHomeFactory implements SmartHomeFactory {

    @Override
    public SmartDevice createLight(String name) {
        return new Light(name);
    }

    @Override
    public SmartDevice createThermostat(String name) {
        return new Thermostat(name);
    }
}
