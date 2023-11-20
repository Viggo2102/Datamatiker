import java.util.ArrayList;

public class FigurApp { //Fra opgaveboen 5.1.14.
    public static void main(String[] args) {

        Figur f1 = new Rektangel(4,3);  // denne her kalder vi fra constructor længere nede, og skriver først dette objekt ind efter constructoren er oprettet.
        Figur f2 = new Punkt();
        Figur f3 = new linje(12); // længden vi taster id her
        Figur f4 = new Cirkel(2); //radius vi taste ind her

        ArrayList<Figur> list = new ArrayList<Figur>();

        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);

        for (Figur f: list) {
            System.out.println(f+" om= " +f.beregnOmkreds() + " a= " + f.beregnAreal());
        }
        /*
        System.out.println(f1); // Vi kunne også gøre sådan her, vi laver bare en ArrayListe i stedet for.
        System.out.println("f1 omkreds: " + f1.beregnOmkreds() + " cm");
        System.out.println("f1 areal: " + f1.beregnAreal() + " cm"); //Vi laver de her to sout til sidst efter toString metoden er lavet.
        */


    }
}

abstract class Figur {  // klassen skal også have abstract når metoden ahr det.
   abstract double beregnOmkreds();  //Metode! Underklasserne SKAL bruge beregnOmkreds metoden, derfor abstract. Man kan ikke kode noget i den her klasse.
    abstract double beregnAreal();
}

class Rektangel extends Figur { //Klasse der nedarver fra superklassen ovenover "absttract call figur". Dette er for at lave en rektangel.
    double hojde;
    double bredde;

    Rektangel (double h, double b) { //konstruktor der gør at vi kan oprette en ny rektangel i main!
        hojde = h;
        bredde = b;
    }

    double beregnOmkreds() {
    return 2*(hojde + bredde);

}

    double beregnAreal() {
    return hojde * bredde;
    }

    @Override
    public String toString() {
        return "Rektangel h = " + hojde + " b = " + bredde;
    }
}

class Punkt extends Figur {
    double beregnOmkreds() { return 5; }
    double beregnAreal() { return 8;}

    @Override
    public String toString() { return "Punkt"; }
    }


class linje extends Figur {

    double length;

    linje (double length) { //Konstruktør

        this.length = length;
    }

    double beregnOmkreds() {
        return 6;
    }

    double beregnAreal() {
        return 2;
        }

    public String toString() {

        return "Linjens laengde = " + length;

    }

}

class Cirkel extends Figur {

    double radius;

    Cirkel(double ra) {
        radius = ra;
    }

    double beregnOmkreds() {
       return 2*radius*3.14;
    }

    double beregnAreal() {
        return 1;
    }

    public String toString() {
        return "Cirklens radius = " +radius;
    }

    }






