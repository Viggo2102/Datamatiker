package Øvelse;

import java.util.Scanner;

public class Hygge {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            double dollar, euro, kurs;
            System.out.println("Indtast beløb i dollars som du ønsker at få vekslet til euro: ");
            System.out.println("Tast 0 for at quitte");

            dollar = scanner.nextDouble();
            euro = 7.5;
            kurs = dollar * euro;
            System.out.println("Du har fået: " + kurs + " udbetalt");

             if (dollar == 0) break ;

        }
    }
}
