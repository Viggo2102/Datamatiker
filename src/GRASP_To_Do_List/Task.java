package GRASP_To_Do_List;

import java.time.LocalDate;

public class Task {

    String title;
    String description;
    LocalDate duedate;
    boolean isDone;

    public Task(String title, String description, LocalDate duedate) {
        this.title = title;
        this.description = description;
        this.duedate = duedate;

    }

    public String toString() {
        return title + "\n" + description + "\n" + "Skal være færdig senest d. " + duedate;
    }

    public static void main(String[] args) {
        Task t = new Task("Rengøring", "Du skal gøre gulvet rent pikfjæs", LocalDate.of(2023,12,4));
        System.out.println(t);
    }

}
