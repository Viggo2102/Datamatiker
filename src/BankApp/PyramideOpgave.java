package BankApp;

class Main {
    public static void main(String[] args) {
        UsePyramids use = new UsePyramids();
        use.useWithConstructor();
    }
}
public class PyramideOpgave {
    double height;
    double side;
    double volume;
     PyramideOpgave() {}


    PyramideOpgave(double height, double side) { //Constructor!! Kendt for at have det samme navn som klassen
        double h = height;
        double s = side;
        this.volume = side * side * height / 4;
    }

    double vol(double height, double side) { //Dette er metoden der hedder vol.
        double volume = side * side * height / 4;
        return volume;

    }
}

    class UsePyramids {

    void useWithConstructor() {
        PyramideOpgave p1 = new PyramideOpgave(2,9);
        PyramideOpgave p2 = new PyramideOpgave(4,16);
        PyramideOpgave p3 = new PyramideOpgave(10,11);

        System.out.println(p1.volume);
        System.out.println(p2.volume);
        System.out.println(p3.volume);
    }
    void use () { //Metode
            PyramideOpgave p1 = new PyramideOpgave();
            // p1.vol(4,8);
            System.out.println(p1.vol(4,8));

            PyramideOpgave p2 = new PyramideOpgave();
            // p2.vol(5,9);
            System.out.println(p2.vol(5,9));

            PyramideOpgave p3 = new PyramideOpgave();
            // p3.vol(5,7);

            System.out.println(p3.vol(5,8));

        }

    }


