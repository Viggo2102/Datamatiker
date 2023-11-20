package Øvelse;

import java.util.Scanner;

public class OpretMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tast;


        while (true) {
            System.out.println("Velkommen til din bank");
            System.out.println("Du har nu følgende valgmuligheder");
            System.out.println("Tast 1 for at oprette en konto");
            System.out.println("Tast 2 for at se kontoudskrift");
            System.out.println("Tast 3 for at indsætte penge");
            System.out.println("tast 4 for at hæve penge");
            System.out.println("tast 5 for at se den årlige rente");
            System.out.println("tast 0 for at afslutte programmet");
            System.out.println();
            System.out.print("Indtast den ønskede handling:");
            tast = scanner.nextInt();
            if (tast == 0) break;

            switch(tast) {
                case 1:
                    System.out.println("Godt arbejde");
                    break;

                case 2:
                    System.out.println("Her er dine penge");

                default:
                    System.out.println("Prøv igen ven");
            }
        } //while

        System.out.println("Programmet lukkes");

    }
}
