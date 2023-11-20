package Øvelse;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*double num1 = 0;
        double num2 = 0;
        int operator;
        double result;*/

        while (true) {
            System.out.println("1. For addition");
            System.out.println("2. For substraktion");
            System.out.println("3. For multiplication");
            System.out.println("4. For division");
            System.out.println("5. For exit");
            System.out.println();
            System.out.print("Enter your choice");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: performAddition(); break;

                case 2: performSubstraktion(); break;

                case 5:
                    System.out.println("Goodbye");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again please");
            }
        }
    }

   static void performAddition() {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter first number: ");
       int num1 = scanner.nextInt();
       System.out.println("Enter second number: ");
       int num2 = scanner.nextInt();
       int result = num1+num2;
       System.out.println("Result of addition: " + result);

    }

    static void performSubstraktion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2= scanner.nextInt();
        int result = num1 - num2;
        System.out.println("Result of substraktion: " + result);
    }
}
