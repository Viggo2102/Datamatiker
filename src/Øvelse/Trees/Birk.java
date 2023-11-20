package Øvelse.Trees;

public class Birk extends Tree {

    public void colour() {
        System.out.println("The leafs in Birk are green");
    }

    int age;
    double height;

    Birk(int age, double height) {
        this.age = age;
        this.height =height;
    }

    public int age() {
        return this.age;
    }

    public double height() {
        return this.height;
    }



    }
