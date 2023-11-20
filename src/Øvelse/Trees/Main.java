package Øvelse.Trees;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Birk b = new Birk(21, 13);
        Eg eg = new Eg(14, 3);
        Gran g = new Gran(440, 8);

        ArrayList<Tree> list = new ArrayList<>();

        list.add(b);
        list.add(eg);
        list.add(g);

        for (Tree t: list) {
            t.colour();
            System.out.println("The age of the tree is: " + t.age() + "The height of the tree is " + t.height() + "m");
        }


    }
}
