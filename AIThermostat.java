package midterm;

public class AIThermostat implements SmartDevice {
    private String name;
    private int temperature = 22;

    public AIThermostat(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " включен. Устанавливаем оптимальную температуру: " + temperature + "°C.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " выключен.");
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println(name + " установил температуру на " + temp + "°C.");
    }
}
