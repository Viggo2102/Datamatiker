package Polymorfism_Vehicle;

import java.util.ArrayList;

public class Vehicle {
    public void go() {
    }


    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();
        ArrayList<Vehicle> list = new ArrayList<>();
        list.add(car);
        list.add(bicycle);
        list.add(boat);

        for(Vehicle v: list){
            v.go();
        }

        /*Vehicle[] racer = {car, bicycle, boat}; //Almindelig Array
        for(Vehicle x: racer) {
            x.go();*/

        }

    }
