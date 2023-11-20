package DynamicPolymorfism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

while (true) {

    System.out.println("What animal do you want?");
    System.out.println("Press 1 for: Dog or press 2 for: Cat. Press 3 for exit.");
    int choice = scanner.nextInt();
    if (choice == 3) break;

    switch (choice) {

        case 1: {
            animal = new Dog();
            animal.speak();
            break;
        }
        case 2: {
            animal = new Cat();
            animal.speak();
            break; }

            default:
                System.out.println("Invalid try again");
            }
        }
    }
}



