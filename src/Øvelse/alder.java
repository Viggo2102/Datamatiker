package Øvelse;

import java.util.Scanner;

public class alder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Velkommen, hvor gammel er du Viktor?");

        while (true) {
            int choice = scanner.nextInt();
            if (choice == 26) {
                System.out.println("det rætti.");
                break;
            } else
                System.out.println("Så gammel er du ikke. Prøv igen");
        }
        }
    }


