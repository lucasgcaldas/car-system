package entities;

import entities.intf.CarMode;

public class Porsche extends Car implements CarMode {

    private String startStop;

    public Porsche(String licensePlate, String color, String motor, String startStop) {
        super(licensePlate, color, motor);
        this.startStop = startStop;
    }

    public String getStartStop() {
        return startStop;
    }

    public void setStartStop(String startStop) {
        this.startStop = startStop;
    }

    @Override
    public String drivingMode() {
        return null;
    }


}
