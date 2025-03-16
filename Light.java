package midterm;

public class Light implements SmartDevice{
    private String name;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " is now OFF.");
    }
}
