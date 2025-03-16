package midterm;

public class LockAdapter implements SmartDevice {
    private LegacyLockSystem legacyLock;

    public LockAdapter(LegacyLockSystem legacy) {
        this.legacyLock = legacy;
    }

    @Override
    public void turnOn() {
        legacyLock.unlock();
    }

    @Override
    public void turnOff() {
        legacyLock.lock();
    }

    @Override
    public String toString() {
        return "Адаптированный дверной замок (состояние: " + (legacyLock.isLocked() ? "закрыт" : "открыт") + ")";
    }
}