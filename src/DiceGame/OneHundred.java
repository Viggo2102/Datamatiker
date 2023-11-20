package DiceGame;

public class OneHundred {

    Player p1 = new Player("Viktor");
    Player p2 = new Player("Kevin");
    Player p3 = new Player("Tarzan");

    void Play() { //Metode..
        int round = 1;
        System.out.println("\t" +p1.name + " " + p2.name + " " + p3.name);
        while (p1.points<100 && p2.points<100) {
            p1.turn();
            p2.turn();
            p3.turn();
            System.out.println("# " +round + "\t" +p1.points + "\t" + "\t" + p2.points + "\t " + p3.points);
            round++;
        }
        if (p1.points<p2.points) {
            System.out.println("Tillyke " + p2.name + " Du har vundet!");
        }
            else System.out.println("Tillyke " + p1.name +" Du har vundet!");
        }


    public static void main(String[] args) {

        OneHundred game = new OneHundred();
        game.Play();

    }
}

