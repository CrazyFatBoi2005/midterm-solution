package midterm;

public class Main {
    public static void main(String[] args) {
        System.out.println("Запуск системы умного дома...\n");

        // Создание контроллера системы (Facade)
        SmartHomeController controller = new SmartHomeController();

        // Использование фабрик для создания устройств (Abstract Factory)
        SmartHomeFactory basicFactory = new BasicSmartHomeFactory();

        SmartDevice kitchenLight = basicFactory.createLight("Kitchen Light");
        SmartDevice livingRoomLight = basicFactory.createLight("Living Room Light");
        SmartDevice thermostat = basicFactory.createThermostat("Living Room Thermostat");

        // Создание комнат (Composite)
        Room livingRoom = new Room("Гостиная");
        livingRoom.addDevice(livingRoomLight);
        livingRoom.addDevice(thermostat);

        Room kitchen = new Room("Кухня");
        kitchen.addDevice(kitchenLight);

        // Добавление комнат в систему
        controller.addDevice(livingRoom);
        controller.addDevice(kitchen);

        // Декорирование только термостата (Decorator)
        SmartDevice scheduledThermostat = new ScheduledOperationDecorator(thermostat, "22:00", "23:00");
        controller.addDevice(scheduledThermostat);

        // Интеграция устаревшей системы через адаптер (Adapter)
        LegacyLockSystem oldLock = new LegacyLockSystem();
        SmartDevice smartLock = new LockAdapter(oldLock);
        controller.addDevice(smartLock);

        // Демонстрация работы системы
        System.out.println("\nВключение всех ламп...");
        controller.turnAllLightsOn();

        System.out.println("\nУстановка глобальной температуры...");
        controller.setGlobalTemperature(22);

        System.out.println("\nРабота с замком...");
        smartLock.turnOn();  // Открытие замка
        smartLock.turnOff(); // Закрытие замка

        System.out.println("\nИтоговый статус системы:");
        controller.getSystemStatusReport();
    }
}
