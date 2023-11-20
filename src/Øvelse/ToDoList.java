package Øvelse;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<String> toDoList;

    public ToDoList() {
        toDoList = new ArrayList<>();
    }

    public void addTask(String task) {
        toDoList.add(task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < toDoList.size()) {
            toDoList.remove(index);
        } else {
            System.out.println("Invalid index. Task not removed.");
        }
    }

    public void viewToDoList() {
        System.out.println("Current To-Do List:");
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + ". " + toDoList.get(i));
        }
    }

    public static void main(String[] args) {
        ToDoList manager = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== To-Do List Manager ===");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View To-Do List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the task to add: ");
                    String newTask = scanner.nextLine();
                    manager.addTask(newTask);
                    break;

                case 2:
                    System.out.print("Enter the index of the task to remove: ");
                    int indexToRemove = scanner.nextInt();
                    manager.removeTask(indexToRemove);
                    break;

                case 3:
                    manager.viewToDoList();
                    break;

                case 4:
                    scanner.close();
                    System.out.println("Exiting the program.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
