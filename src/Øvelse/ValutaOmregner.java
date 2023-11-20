package Øvelse;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValutaOmregner {
    public static void main(String[] args) {
        System.out.println("Velkommen til Valuta omregner.");
        System.out.println("Her kan du veksle fra danske kroner til svenske, norske, finske eller islandske kroner.");
        double belob;           // Beløb i DKK som ønsks vekslet
        double udbetalt;        // Beløb til udbetaling i ny valuta
        double kursSEK=0.63;    // 1 SEK = 0.63 DKK
        double kursNOK=0.65;
        double kursEUR=7.45;     // I Finland anvendes euro
        double kursISK=0.052;
        int valutavalg;         // Talkode for valgte valuta
        String valutaNavn;      // Navn for valgte valuta
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input=new Scanner(System.in);

        while (true) {
            System.out.println("Tast 1 for svenske kroner");
            System.out.println("Tast 2 for norske kroner");
            System.out.println("Tast 3 for finske euro");
            System.out.println("Tast 4 for islandske kroner");
            System.out.print("Indtast valuta: ");
            valutavalg=input.nextInt();
            System.out.println();
            System.out.print("Indtast beløb i danske kroner (Tast 0 for at afslutte programmet): ");
            belob= input.nextDouble();
            if (belob==0) break;


            switch (valutavalg) {
                case 1: udbetalt=belob/kursSEK; valutaNavn="SEK"; break;
                case 2: udbetalt=belob/kursNOK; valutaNavn="NOK"; break;
                case 3: udbetalt=belob/kursEUR; valutaNavn="EUR"; break;
                case 4: udbetalt=belob/kursISK; valutaNavn="ISK"; break;
                default:
                    System.out.println("Ugyldigt valg af valuta. Transaktionen annuleres.");
                    udbetalt=0;
                    valutaNavn="";
            }
            System.out.println("Til udbetaling "+df.format(udbetalt)+" "+valutaNavn);
        } // while
        System.out.println("Programmet lukkes.");
    }
}