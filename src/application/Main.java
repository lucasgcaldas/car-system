package application;

import entities.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Porsche p1 = new Porsche("ABC123","blue","12MM","startStop");
        Porsche p2 = new Porsche("DEF123","pink","12MM","startStop");

        Ferrari f1 = new Ferrari("GHI123", "black", "13FF", "parkAssist");
        Ferrari f2 = new Ferrari("JKL123", "white", "13FF", "parkAssist");

        Fx10 m1 = new Fx10("MNO123", "black", "14FF", "presencialKey");
        Fx10 m2 = new Fx10("PQR1213", "black", "14FF", "presencialKey");

        List<Car> cars = new ArrayList<>();
        cars.add(f1);
        cars.add(f2);
        cars.add(m1);
        cars.add(m2);

        for (Car car : cars){
            if (car instanceof Ferrari){
                Ferrari ferrari = (Ferrari) car;
                System.out.println(ferrari.drivingMode());
            }
            System.out.println(car);
        }

        System.out.println("--------------------------------");
        cars.add(p1);
        cars.add(p2);
        for (Car car : cars){
            System.out.println(car);
        }
        //System.out.println(cars);
        //Map<Car, Car> carMap = new HashMap<>();
    }
}
