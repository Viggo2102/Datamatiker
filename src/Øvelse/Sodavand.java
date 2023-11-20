package Øvelse;

import java.util.ArrayList;

public class Sodavand {
    String name;
    String taste;
    int calories;


    public Sodavand(String name, String taste, int calories) {
        this.name = name;
        this.taste = taste;
        this.calories = calories;
    }

    public String toString() {
        return name + taste + calories;
    }

    void open() {
        System.out.println("Open the " + name + "please");
    }

    public static void main(String[] args) {

        Sodavand soda1 = new Sodavand("Coca Cola,", " Cherry, ", 180);
        Sodavand soda2 = new Sodavand("Fanta, ", "Exotic, ", 200);
        Sodavand soda3 = new Sodavand("Pepsi, ", "Max, ", 0);
        ArrayList<Sodavand> list = new ArrayList<>();

        list.add(soda1);
        list.add(soda2);
        list.add(soda3);

        for (Sodavand s: list) {
            System.out.println(s.name + s.taste + s.calories);
            s.open();
            System.out.println();

        }



        //System.out.println(soda1);
        //System.out.println(soda2);

    }
}



