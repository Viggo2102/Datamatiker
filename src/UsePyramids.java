import java.util.ArrayList;

class Pyramids {
    double side;
    double height;
    String Navn;

    public Pyramids(double side, double height, String Navn) {
        this.side = side;
        this.height = height;
        this.Navn = Navn;

    } //constructor

    public double calculateVolume() {
        return side * side * height / 4;
    } //Method

    @Override
    public String toString() {
        return ("Pyramidens side er " + side + ", Pyramidens højde er " + height + " Pyramiden navn er " + Navn);
    }

} //PYRAMID CLASS

public class UsePyramids {
    public static void main(String[] args) {
        Pyramids pyramid1 = new Pyramids(9, 18, "Hej");
        Pyramids pyramid2 = new Pyramids(6,8, "LOl");
        Pyramids pyramid3 = new Pyramids(8,12, "GG");

        /* ArrayList<Pyramids> list = new ArrayList<Pyramids>(); //ArrayListen er lavet for at indeholde pyramiderne.
        //Man kan få dette til at gøre Main mindre hvis jeg vidste hvordan. Med Arraylisten hører list.add..... osv, samt for loopet der er udkommenteret.

        list.add(pyramid1);
        list.add(pyramid2);
        list.add(pyramid3);


        for (Pyramids p: list) { //For loopet for at vise at man oså kan gøre det med dette.
            System.out.println("Volumen af pyramide = " + p.calculateVolume());
        }*/

        System.out.println("Pyramid 1: " + pyramid1);
        System.out.println("Pyramid 2: " + pyramid2);
        System.out.println("Pyramid 3: " + pyramid3);

        System.out.println("Volume of pyramid 1 = " + pyramid1.calculateVolume());
        System.out.println("Volume of pyramid 2 = " + pyramid2.calculateVolume());
        System.out.println("Volume of pyramid 3 = " + pyramid3.calculateVolume());

    }
}