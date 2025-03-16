package midterm;
import java.util.ArrayList;
import java.util.List;

public class Room implements SmartDevice {
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void removeDevice(SmartDevice device) {
        devices.remove(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Включение всех устройств в комнате: " + name);
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        System.out.println("Выключение всех устройств в комнате: " + name);
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    @Override
    public String toString() {
        return "Комната: " + name + " (" + devices.size() + " устройств)";
    }
}
