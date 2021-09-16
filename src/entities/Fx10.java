package entities;
public class Fx10 extends Maserati {

    public Fx10(String licensePlate, String color, String motor, String presencialKey) {
        super(licensePlate, color, motor, presencialKey);
    }

    public String modify(){
        return "racingMode";
    }
}
