package DiceGame;

import java.util.ArrayList;

public class DiceArray {
    /*Random gen = new Random();
    void roll () {
    }*/

    static double calculateMean(ArrayList<Integer> rolls) { //begge emtoder skal være Static, ellers virker det ikke. Hvorfor skal jeg lige have tjkket op på!
        int totalSum = 0;
        for (int roll: rolls) { //Roll metoden kommer fra vores dice klasse. Man kunne også have lavet den selv ovenover.
            totalSum = totalSum + roll;
        }
        return totalSum / (double) rolls.size();

    }

    static int countSixes(ArrayList<Integer> rolls) {
        int sixCounts = 0;
        for (int roll: rolls) {
            if (roll == 6) {
                sixCounts++;
            }
        }
        return sixCounts;

    }

    public static void main(String[] args) {
        ArrayList<Dice> d = new ArrayList<>();
        Dice d5 = new Dice();
        d.add(d5);

        ArrayList<Integer> rolls = new ArrayList<>();
        //int totalSum = 0;  Hvis ikke vi ville lave sixcount og mean som metoder kunne vi gre sådan her. Uden arraylisten oppeover
        //int sixCounts=0;

        for (int i=1; i<=100; i++) {
            int rollResult = d5.roll();
            rolls.add(rollResult);
            System.out.println("Roll " + i + ": " + rollResult);
            //System.out.println(d5.roll()); Min måde at gø et på.

            /*int rollResult = d5.roll(); // Alt nedenstående er Chatgpt's måde at gøe det her på!
            totalSum+=rollResult;
            if (rollResult == 6) { //Sådan her hvis ikke vi havde lavet metoder til mean og sixes.
                sixCounts++;*/
            }

        double mean = calculateMean(rolls);
        int sixCounts = countSixes(rolls);

        System.out.println("Mean: " + mean);
        System.out.println("Number of sixes: " + sixCounts);

            //System.out.println( "Roll " + i + ": " + rollResult); // Uden metode kan i gøre sådan her.
        }

        /*double mean = totalSum/100; //igen det her er uden metoderne, måpde at regne det ud på.
        System.out.println("Mean: " + mean);
        System.out.println("Number of sixes: " + sixCounts);*/
        }


