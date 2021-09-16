package entities;

public abstract class Maserati extends Car {

    private String presencialKey;

    public Maserati(String licensePlate, String color, String motor, String presencialKey) {
        super(licensePlate, color, motor);
        this.presencialKey = presencialKey;
    }

    public String modify() {
        return "turboMode";
    }

    public String getPresencialKey() {
        return presencialKey;
    }
}
