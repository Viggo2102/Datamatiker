package GRASP_To_Do_List;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskController {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Task> list = new ArrayList<>();

    Task t1 = new Task("Rengøring", "Du skal gøre gulvet rent elskede", LocalDate.of(2023,12,4));
    Task t2 = new Task("Vaske tøj", "Du skal vaske tøj amigo", LocalDate.of(2023,12,4));
    Task t3 = new Task("Støvsuge", "Du skal støvsuge med næsen ven", LocalDate.of(2023,12,4));


    public void makeNewTask() {
        System.out.println("Skriv opgavens navn: ");
        String name = scanner.nextLine();


        System.out.println("Hvad skal der laves?");
        String newName = scanner.nextLine();

        System.out.println("Hvornår skal opgaven laves?");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        Task newtask = new Task(name, newName, date);
        list.add(newtask);
        System.out.println("Opgaven er oprettet :-) ");
    }

    public void deleteTask(int index) {     //chatten hjalp til her.
        if (index>=0 && index<list.size()) {
            list.remove(index);
        } else
            System.out.println("invalid, try again.");

    }

    public void watchTasks() {
        System.out.println("Nuværende taskListe: ");
        System.out.println(t1 + "\n" + t2 + "\n" + t3);
        for (int i = 0; i< list.size(); i++) {
            System.out.println(i + " " + list.get(i) );
        }
    }




    public static void main(String[] args) {
        /*TaskController t1 = new TaskController();
        t1.makeNewTask();*/
    }

}

