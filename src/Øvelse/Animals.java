package Øvelse;

import java.util.ArrayList;

public class Animals {
    String name;
    String colour;
    double height;
    int age;


 public Animals(String name, String colour, double height, int age) { //CONSTRUCOTR
    this.name = name;
    this.colour = colour;
    this.height = height;
    this.age = age;
    }

    public String toString() {
    return name + " " + colour + " " + height + "m" + " " + age;
    }

    public void running(){ //metode
        System.out.println(name + " loves to run");
    }

    public static void main(String[] args) {
        Animals animal1 = new Animals("Elephant", "Grey", 3, 21);
        Animals animal2 = new Animals("Giraffe", "Yellow",10, 5);
        Animals animal3 = new Animals("Dog", "white", 1, 8);

        ArrayList<Animals> list = new ArrayList<Animals>();

        list.add(animal1);
        list.add(animal2);
        list.add(animal3);

        for (Animals a: list) {
            System.out.println(a.name + " " + a.colour + " " + a.age + "years old" + " " + a.height + "m");
        }

        //System.out.println(animal1);
        animal1.running();


    }

}
