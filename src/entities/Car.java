package entities;

import java.util.Objects;

public abstract class Car{

    private String licensePlate;
    private String color;
    private String motor;

    public Car(String licensePlate, String color, String motor) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.motor = motor;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getColor() {
        return color;
    }

    public String getMotor() {
        return motor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(licensePlate, car.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate);
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", color='" + color + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}
