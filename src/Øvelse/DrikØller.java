package Øvelse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DrikØller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valg;

        while (true) {
            System.out.println("Det er blevet fredag, vælg en aktivitet fyr!");
            System.out.println("Tast 1 for: Drik øl?");
            System.out.println("Tast 2 for: Gå hjem?");
            System.out.println("Tast 3 for: Hyggeaften med konen??");
            System.out.println("Tast 0 for at quitte");
            valg = scanner.nextInt();
            if (valg == 0)
                break;
            switch(valg)  {
                case 1:
                    System.out.println("Godt valg fyr! Smut du en tur i Fredagsbaren,du har fortjent det!");
                    System.out.println("Tast 1 for at fortsætte drikningen");
                    System.out.println("Tast 2 for ikke at drikke mere");
                    int naestevalg = scanner.nextInt();
                    if (naestevalg ==1) {
                        System.out.println("Godt valg");
                    } else System.out.println("Ikke godt valg ven");
                    break;

                case 2:
                    System.out.println("Negativ! Fredagsslikken skal suges i aften!");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Du kan godt selv høre det ik? Forfra du.");
                    System.out.println();
                    break;

                default:
                    System.out.println("Tryk nu på en ordentlig tast ven, så er det fandme ik mere svært");
            }
            }

        }


    }


