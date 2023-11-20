package DiceGame;

public class Player {

    String name;
    Cup cup = new Cup();
    int points;

    Player (String name) {
        this.name = name;
    }

    void turn() {
        cup.roll();
        points = points+ cup.getsum();
    }

    public static void main(String[] args) {
        Player p = new Player("Claus");

        while (p.points<100) { // Vi laver et while loop for at teste her. Ikke et for loop som med de andre.
            p.turn();
            System.out.println(p.points);
        }

    }
}
