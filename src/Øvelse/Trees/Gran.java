package Øvelse.Trees;

public class Gran extends Tree {
    @Override
    public void colour() { //Metode fra superklasssen "trees".
        System.out.println("These leafs are a bit different, they are blue today");
    }
    int age; //initiationsvariabler
    double height;

    public Gran(int age, double height) { //Constructor
        this.age= age;
        this.height = height;

    }

    public int age() { //metode
        return this.age;
    }

    public double height() { //metode
        return this.height;

    }
}
