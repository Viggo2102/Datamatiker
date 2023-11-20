package GRASP_To_Do_List;

import Øvelse.ToDoList;

import java.time.LocalDate;
import java.util.Scanner;

public class Interface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskController t = new TaskController();

        while (true) {
            System.out.println("\n=== To-Do List Manager ===");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View To-Do List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            if(choice == 4) break;

            scanner.nextLine();

            switch (choice) {
                case 1:
                    t.makeNewTask();
                    break;

                case 2:
                    int indexToRemove = scanner.nextInt();
                    t.deleteTask(indexToRemove);
                    break;


                case 3:
                    t.watchTasks();
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
