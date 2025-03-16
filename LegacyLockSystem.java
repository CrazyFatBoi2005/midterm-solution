package midterm;

public class LegacyLockSystem {
    private boolean locked = true;

    public void lock() {
        locked = true;
        System.out.println("🔒 Замок закрыт (Legacy System)");
    }

    public void unlock() {
        locked = false;
        System.out.println("🔓 Замок открыт (Legacy System)");
    }

    public boolean isLocked() {
        return locked;
    }
}
