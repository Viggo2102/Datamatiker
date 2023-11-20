package Øvelse.Trees;

public class Eg extends Tree {
    public void colour() {
        System.out.println("The colours on Eg are red in the autumn");
    }

    int age;
    double height;

    Eg(int age, double height) {
        this.age = age;
        this.height = height;
    }

    public int age() {
        return this.age;
    }

    public double height() {
        return height;
    }

    }


