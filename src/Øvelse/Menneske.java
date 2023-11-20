package Øvelse;

import java.util.ArrayList;

//Laver bare lidt kode for sjov her med metoder, constructor og toString.
public class Menneske {
    public static void main(String[] args) {

        Human human1 = new Human("Vintor", 26, 85.5);
        Human human2 = new Human("Bobben", 26, 75);

        /*ArrayList<Human> list = new ArrayList<>();

        list.add(human1);
        list.add(human2);

        for (Human h: list) {
            System.out.println(h.name + h.weight + h.age);
        }*/


        human1.eat();
        human1.running();
        human2.drinking();


        // System.out.println(human1.toString());
        System.out.println(human2);
    }
}

class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){ //Konstruktor
        this.name = name;
        this.age = age;
        this.weight = weight; }


    public String toString() { //string metode for at formatere udprintet. Ellers set det underligt ud.

        String bord = name + "\n" + age + "\n" + weight; // Alt dette kan også smides ned i return, vi behøver ikke at definere String "bord".
        return bord;

    }

    void running () {
        System.out.println(name + " Loves to run");

    }



    void eat () { //Metode til at få personen til at spise + lidt ekstra for sjov.
        System.out.println(name + " is eating");
        System.out.println(this.name + " is " + this.age + " years old " + "and he weighs " + this.weight + "kg");

    }

    void drinking () { //metode til at drikke
        System.out.println(this.name + " is drinking");


    }



} //Class Human