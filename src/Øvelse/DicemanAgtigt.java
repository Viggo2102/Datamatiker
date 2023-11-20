package Øvelse;

import java.util.Random;

public class DicemanAgtigt {
    public static void main(String[] args) {
        Random gen = new Random();
        int valg;
        valg = gen.nextInt(6)+1;

        System.out.println("Du har slået en: " + valg + "\n");

        /*if (valg == 1)
            System.out.println("Godmorgen");

        if (valg ==2)
            System.out.println("Hej");

        if (valg == 3)
                System.out.println("Davs");
        if (valg ==4)
                System.out.println("Du er sgu sø'!");
        if (valg ==5)
            System.out.println("Du er tæt på mit hjerte! ");

        if (valg ==6) System.out.println("JEg gav dig mit hjerte, men du ville have min sjæl");
*/

        switch (valg) {

            case 1:
                    System.out.println("Du må gerne sove længe i dag");
                    break;
            case 2:
                    System.out.println("Hej");
                    break;
            case 3:
                    System.out.println("Godmorgen");
                    break;
            case 4:
                    System.out.println("Du hygger bare i dag.");
                    break;
            case 5:
                    System.out.println("JEg elsker dig");
                    break;
            case 6:
                    System.out.println("Verden ser sgu sjov ud når man tripper");
                    break;
        }

    }


    }

