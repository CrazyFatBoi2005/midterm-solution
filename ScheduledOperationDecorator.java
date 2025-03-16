package midterm;
import java.time.LocalTime;

public class ScheduledOperationDecorator extends DeviceDecorator {
    private String startTime;
    private String endTime;

    public ScheduledOperationDecorator(SmartDevice device, String startTime, String endTime) {
        super(device);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public void turnOn() {
        if (isWithinSchedule()) {
            System.out.println("[SCHEDULE] Включаем устройство в запланированное время");
            super.turnOn();
        } else {
            System.out.println("[SCHEDULE] Сейчас не время включать устройство");
        }
    }

    @Override
    public void turnOff() {
        if (isWithinSchedule()) {
            System.out.println("[SCHEDULE] Выключаем устройство в запланированное время");
            super.turnOff();
        }
    }

    private boolean isWithinSchedule() {
        LocalTime now = LocalTime.now();
        LocalTime start = LocalTime.parse(startTime);
        LocalTime end = LocalTime.parse(endTime);
        return now.isAfter(start) && now.isBefore(end);
    }
}
