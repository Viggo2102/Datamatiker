package DiceGame;

import java.util.Random;

public class Dice {

    static Random gen = new Random(); //static gør at alle dice klasserne kan deles om denne Random gen, i stedet for at alle skal have en ny. Det ville virke, men vil fylde lidt mere i pc'en hukommelse.

    int roll() { //metode
    return gen.nextInt(6)+1;
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        for (int i=1; i<=10; i++) {
            System.out.println(dice.roll());
        }


    }
}
