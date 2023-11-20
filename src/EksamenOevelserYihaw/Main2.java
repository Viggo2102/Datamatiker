package EksamenOevelserYihaw;

import java.util.ArrayList;

abstract class Animals {
    String name;

    Animals(String name) {
    this.name = name;
    }

    public abstract String makeSound();
}

class Dog extends Animals {

   public Dog (String name) {
       super(name);
   }

    @Override
    public String makeSound() {
        return name + " woof";
    }
}

class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return name + " Miaw";
    }
}

public class Main2 {
    public static void main(String[] args) {

        ArrayList<Animals> dyreværnet = new ArrayList();

        dyreværnet.add(new Dog("Rollo"));
        dyreværnet.add(new Dog("Liza"));
        dyreværnet.add(new Dog("Edward"));
        dyreværnet.add(new Cat("Elsa"));
        dyreværnet.add(new Cat("Tuborg"));
        dyreværnet.add(new Cat("Lizzie"));

        for (Animals a: dyreværnet) {
            System.out.println(a.makeSound());
        }

    }
}
