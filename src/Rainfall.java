import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Rainfall { //livekodning fra 6/11 - 23. 2D arrays.

    static final int MAPALANA = 0; // Final gør at man ikke senere i programmet kan ændre det her. Disse er konstanter fra Ranfalldata.txt
    static final int RATNAPURA = 1; // Man laver de her så man ikke skal huske psitionerne fra f.eks rainfalldata  hele tiden.
    static final int SITA_Eliya = 2;
    static final int Badulla = 3;
    static final int MATALE = 4;
    static final int ANARUDHAPURA = 5;
    static final int AMPARA = 6;
    static final int HAMBEGAMUWA = 7;
    static final int AMBALANTOTA = 8;
    static final int KIRAMA = 9;
    static final int A_PALESSA = 10;

    enum Month { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OKT, NOV, DEC }; //det her er et samme som sker oppe over, bare en anden måde at skrive det på.
    //enum bliver vit sjældent brugt i vikeligheden. Mere den anden type som ovenover.
    public static void main(String[] args) throws IOException {

        int[] [] data = new int [11] [12];

        FileReader fil = new FileReader("RainfallData.txt");
        BufferedReader ind = new BufferedReader(fil);
        String linje = ind.readLine(); //Indlæser en linje fra filen.
        int r = 0;
        while (linje != null)
        {
            String[] bidder = linje.split(" "); // Her har vi 12 bidder som filen læser, de bliver afbrudt af "mellemrum".
           for (int c = 0; c<=11; c++){
              data[r] [c] = Integer.parseInt(bidder[c]); // Parseint fordi "bidder" er en string, og data er en int, så de kan ikke snakke sammen. Derfor parse int:
           }
            linje = ind.readLine();
           r++;
        }
        fil.close();

        System.out.println(data[AMBALANTOTA][Month.MAY.ordinal()]); // Går ned i plads nummer 2 (mængde nedbør i tekstfilen) og 3 elementer hen (Måneden). 6 og 4 i et her tilfælde er konstanter.
            //Det er to forskellige måder at deklerere konstanter på. Month.MAy.Ordenal er hvis man bruger Enum metoden længere oppe. Ambalonta i det her tilfælde er hvis man bruger tildelingen som v giver i starten.

        for (int by = MAPALANA; by<=A_PALESSA; by++) { // for loop for at se samlet nedbør for maj måned for alle byerne.
            System.out.println(data[by] [Month.MAY.ordinal()]);
        }
        for (Month m: Month.values()) { //values løber alle månederne igennem så vi fpr et år m er variabel af enum Month.
            System.out.print(data[AMPARA] [m.ordinal()] + "\t"); // nedbør for året
        }
    }
}
