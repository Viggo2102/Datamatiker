package Øvelse;

import java.util.Scanner;

public class Guess_A_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100) + 1;
        int numberCount = 0;
        System.out.println("Welcome, try and guess the number i'm thinking of between 1-100!");

        while (true) {
            numberCount++;
            int guess = s.nextInt();

            if (guess < myNumber) {
                System.out.println("Too low, try again");

            } else if (guess > myNumber) {
                System.out.println("Too high, try again");

            } else {
                System.out.println("You did it fuckface. It took you " + numberCount + " turns.");
                break;
            }
        } //while loop
    }//main

}//class
