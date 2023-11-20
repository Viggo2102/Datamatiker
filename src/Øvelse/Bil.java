package Øvelse;

import java.util.ArrayList;

public class Bil { // Jeg vil gerne oprette en bil her.
    public static void main(String[] args) {

        Car car1 = new Car("Hyundai", "i20", 2016, 40500);
        System.out.println(car1);

        System.out.println(); // For at give lidt luft i udprinten.

        Car car2 = new Car("Ford", "Kuga", 2020, 21000);
        System.out.println(car2);

        ArrayList<Car> list = new ArrayList<>();

        list.add(car1);
        list.add(car2);

        for (Car c: list) {
            System.out.println(c.brand + " " + c.model + " " + c.year + " " + c.kmdriven);
        }

    }


}

class Car {
    String brand;
    String model;
    int year;
    double kmdriven;


    public Car(String brand, String model, int year, double kmdriven) { //Constructor
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.kmdriven = kmdriven;
    }


    public String toString() {
        return brand + "\n" + model + "\n" + year + "\n" + kmdriven;

    }


}
