package midterm;

public abstract class DeviceDecorator implements SmartDevice {
    protected SmartDevice decoratedDevice;

    public DeviceDecorator(SmartDevice device) {
        this.decoratedDevice = device;
    }

    @Override
    public void turnOn() {
        decoratedDevice.turnOn();
    }

    @Override
    public void turnOff() {
        decoratedDevice.turnOff();
    }
}

