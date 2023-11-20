public class PolynomiumOpgave {
    public static void main(String[] args) {

        Polynomium p1 = new ForstegradsPolynomium(5,9);
        System.out.println("Resultatet af p1 = " +p1.f(5));

        System.out.println();

        Polynomium p2 = new Andengradspolynomium(3,5,8);
        System.out.println("Resultatet af p2 = " + p2.f(3));

    }
}

// Dette er lidt som et interface, fordi metoden ikke er defineret inde i. + klassen har ikke nogen "krop".
abstract class Polynomium { //Superklassen. Laves så de andre klasser kan nedarvde fra den her. Deror abstract. Dette her er også kaldet et interface!!

    abstract double f(double x);

}

class ForstegradsPolynomium extends Polynomium {
    double a;
    double b;

    ForstegradsPolynomium(double A, double B) {
        a = A;
        b = B;
    }

    @Override
    double f(double x) { //toString.
        return a*x+b;
    }


}

class Andengradspolynomium extends Polynomium {

    double a, b, c;

    Andengradspolynomium(double A, double B, double C) {

        a= A;
        b = B;
        c = C;

    }
    double f(double x) {
        return a*x*x+b*x+c;
    }
}




