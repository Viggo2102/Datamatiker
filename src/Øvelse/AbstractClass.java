package Øvelse;

public class AbstractClass {
    public static void main(String[] args) {
chihuahua c = new chihuahua();
c.bark();
    }
}

class chihuahua extends dog {
}

abstract class dog {

     void bark() { //metode
        System.out.println("*Barkkk*");

    }
}
