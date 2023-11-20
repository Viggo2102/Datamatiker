package EksamenOevelserYihaw;

import java.util.ArrayList;
import java.util.Collections;

public class Hogwarts {
    public static void main(String[] args) {
        HogwartStudent h1 = new HogwartStudent("Aske", "ddemad", "Gryffindor");
        HogwartStudent h2 = new HogwartStudent("Aske", "candmand", "Slytherin");
        HogwartStudent h3 = new HogwartStudent("Aske2", "aademad3", "Hufflepuff");

        ArrayList<HogwartStudent> list = new ArrayList<>();
        list.add(h1);
        list.add(h2);
        list.add(h3);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
            try {
                h1.setHouse("Gryffindor");
                h2.setHouse("Slytherin");
                h3.setHouse("Hufflepuff");

            } catch (HogwartsException h) {
                System.out.println(h);
            }

    }
    }

class HogwartStudent implements Comparable <HogwartStudent> {
    String firstName;
    String lastName;
    String house;

    HogwartStudent(String firstName, String lastName, String house) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;

    }

     void setHouse(String h) throws HogwartsException {
        if (h.equals("Gryffindor") || h.equals("Slytherin") || h.equals("Hufflepuff" )|| h.equals("Ravenclaw"))
             house = h;
          else throw new HogwartsException(h);
    }

    public String toString() {
        return "name: " + firstName + "Lastname " + lastName + "house " + house;
    }

    /*public String getLastName() {
        return lastName;
    }*/

    public int compareTo (HogwartStudent o) {
        return lastName.compareTo(o.lastName);
    }
}

class HogwartsException extends Exception {
    String house;

    HogwartsException(String house) {
        this.house = house;
    }

    public String toString() {
        return "Forkert hus din nød : " +house;
    }
}
