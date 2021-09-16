package entities;

import entities.intf.CarMode;

public class Ferrari extends Car implements CarMode {

    private String parkAssist;

    public Ferrari(String licensePlate, String color, String motor, String parkAssist) {
        super(licensePlate, color, motor);
        this.parkAssist = parkAssist;
    }

    @Override
    public String drivingMode() {
        return "drivingMode";
    }

    public String getParkAssist() {
        return parkAssist;
    }

    public void setParkAssist(String parkAssist) {
        this.parkAssist = parkAssist;
    }
}
