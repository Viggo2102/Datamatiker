//Opret userklasse,  hvor en user  har et navn.•Opret klassen  Main med en mainmetode.•Opret 5 users  i en liste ved brug af et loop, hvor vi angiver deres navn til hver.•Nu skal du printe  de forskellige  brugere ud ( med navn ).•Nu skal du ændre den første brugers navn til ”Hans”.•Vær sød at sorte userne.  Print herefter userne  ud.•Vær sød at fjerne den 3 user.  Print derefter userne  ud igen.•Vær sød at erstatte første user i listen med useren ”Poul”.

package Eksamen_1_sem_ovelse;

import java.util.ArrayList;
import java.util.Scanner;

public class Ovelse_1 {

}

class User {

    String name;

    User(String name) {
        this.name =name;
    }

    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {

        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("Hej");
        User u2 = new User("Per");
        User u3 = new User("Erik");
        User u4 = new User("Farmand");
        User u5 = new User("gg");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);

        for (User u: list) {
            System.out.println(u);
        }
        u1.setName("Hans");
        for (User u: list) {
            System.out.println(u);
        }

    }
}

