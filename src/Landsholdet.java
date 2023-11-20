public class Landsholdet {
    public static void main(String[] args) {

        //Spiller s = new Spiller ("Kasper Schmaivehl", 1);
        Spiller [] hold = new Spiller[11];
        hold [0] = new Spiller ("Kasper Schmeichel", 1);
        hold [1] = new Spiller ("Henrik Dalsgaard", 14);
        hold [2] = new Spiller ("Simon kjær", 4);
        hold [3] = new Spiller ("Mathias Jørgensen", 13);
        hold [4] = new Spiller ("Henrik Dalsgaard", 14);
        hold [5] = new Spiller ("Henrik Dalsgaard", 14);
        hold [6] = new Spiller ("Henrik Dalsgaard", 14);
        hold [7] = new Spiller ("Henrik Dalsgaard", 14);
        hold [8] = new Spiller ("Henrik Dalsgaard", 14);
        hold [9] = new Spiller ("Henrik Dalsgaard", 14);
        hold [10] = new Spiller ("Henrik Dalsgaard", 14);

        printOpstilling(hold);
        System.out.println();

        hold[9] = new Spiller("Rasmus Hoejlund", 18); // Vi skifter Hoejlund ind istedet for nr 9.
        printOpstilling(hold);


    }

    static void printOpstilling(Spiller [] team) { // Laves som det sidste inden i kan printe holdet ud i main.
        for (int i = 0; i<team.length; i++)
            System.out.println(team[i]);
    }
}

class Spiller {
    String navn;
    int rygnummer;

    Spiller(String navn, int nummer) {
        this.navn = navn;
        rygnummer = nummer;
        }

        public String toString() {
        return navn + " " + rygnummer;
        }
    }


