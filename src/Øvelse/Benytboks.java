package Øvelse;

class Boks  {
    double length;
    double height;
    double width;

    double volumen() {
        double vol;
        vol = length * height * width;
        return vol;
    }

}


public class Benytboks {
    public static void main(String[] args) {

        double rumfang;

        Boks boksobjekt;
        boksobjekt = new Boks();
        boksobjekt.length = 6.9;
        boksobjekt.height = 9.0;
        boksobjekt.width = 5.5;
        rumfang = boksobjekt.volumen();
        System.out.println("Boksens volumen: " + rumfang);
    }
}
