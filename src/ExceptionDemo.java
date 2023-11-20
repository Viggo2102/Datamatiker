public class ExceptionDemo {
    public static void main(String[] args) {
        KlippeKort k1 = new KlippeKort("A123");
        System.out.println(k1);

        while (true) {
            System.out.println(k1);
            try {
                k1.klip();
            } catch (KlippeKortException ex) {
                System.out.println(ex);
                break;
            }
        }
        System.out.println("Tak for i dag yaaa!");

    }
}

class KlippeKort {
    int antalKlip = 10;     //resterende antal klip tilbage på kortet.
    String id;              //Stregkoden.

    KlippeKort(String id) {
        this.id = id;
    }

    void klip() throws KlippeKortException {   //Metode til at trække et klip fra.

        if (antalKlip == 0) throw new KlippeKortException(id); //Grunden til at vi skriver id her, er at vi overfører klippekortests id fra exceptions contructoren længere nede.
        antalKlip--;
    }

    public String toString() {
        return "klippekort: " + id + "\t" + "antal klip = " + antalKlip;
    }
}

class KlippeKortException extends Exception {

    String id;

    KlippeKortException(String id) {
        this.id = id;
    }

    public String toString() {
        return "KlippekortException for kort " +id;
    }

}
