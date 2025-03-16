package midterm;
import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllLightsOn() {
        System.out.println("🔆 Включаем все лампы...");
        for (SmartDevice device : devices) {
            if (device instanceof Light) {
                device.turnOn();
            }
        }
    }

    public void setGlobalTemperature(int temperature) {
        System.out.println("🌡️ Устанавливаем температуру во всём доме на " + temperature + "°C...");
        for (SmartDevice device : devices) {
            if (device instanceof AIThermostat) {
                ((AIThermostat) device).setTemperature(temperature);
            }
        }
    }

    public void getSystemStatusReport() {
        System.out.println("📋 Отчёт о системе:");
        for (SmartDevice device : devices) {
            System.out.println("- " + device);
        }
    }
}

