package BankApp;

import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp3 {
    public static void main(String[] args) {

        Account a1 = new indLaan("Viktor Rasmussen", 5);
        /*a1.deposit(500);
        a1.withdraw(400);
        a1.printTransactions();
        System.out.println(); */

        //LocalDate.of(2023, 12, 24);
        Account a2 = new Hojrente("Lord Nelson", 10, 5000, LocalDate.of(2023, 12, 24));
        /*a2.deposit(300);
        a2.withdraw(10000);
        a2.printTransactions();*/

        Account a3 = new Kredit("Farmand langemand", 7);

        Account a4 = new Milliondollarbby("Lars Lars", 0, 20000);

        Account a5 = new Børneopsparing("Neil Armstrong", 10, 15000, LocalDate.of(2041, 9, 26));



        ArrayList<Account> list = new ArrayList<Account>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        a3.withdraw(11000);

        for (Account a: list) a.printTransactions();
        for (Account a: list) a.deposit(100); //Her ligger vi 100 til alle kontoerne.
        for (Account a: list) a.annualInterest();
        for (Account a: list) a.printTransactions();
        a5.withdraw(10000);

    }
}

class indLaan extends Account { //Her trækker vi på dataen fra vores Account klasse fra Bankapp2. Vi vil gerne lave en indlåns konto nu. Ved hjælp af "extends". Den nedarver fra account klassen.

    indLaan (String ow, double ir) { //konstruktør hvor vi initialiserer variablerne/datatyperne. Vigtigt at vi i bankApp2 har sat variablerne til "protected" og ikke f.eks "private".
    super (ow, ir); //super sender vi værdierne fra "Account constructoren" (overklassen contrsuctor).

    }

    void withdraw (double amount) {
        if (balance >= amount) {
            super.withdraw(amount); //Igen, her trækker vi fra hoved konstruktøren hvor vi allerede har skrevet koden ind.
        }
                else {
                System.out.println("Du kan højst hæve " + balance);

            }

            } //withdraw
        }

class Hojrente extends Account {
    LocalDate releaseDate;
    Hojrente (String ow, double ir, double startbalance, LocalDate rd) { // rd = Release Date.
        super(ow, ir);
        super.deposit(startbalance);
        releaseDate = rd;
    }

    void deposit (double amount) { //Metode
        System.out.println("Du kan ikke sætte penge ind på denne konto");
    }

    void withdraw(double amount) {
        if (releaseDate.isAfter(LocalDate.now()))
            System.out.println("Du kan først hæve efter " + releaseDate);
        else
            super.withdraw(amount);
    }

}

class Kredit extends Account {

    Kredit (String ow, double ir) {
        super(ow, ir);

    }

    void withdraw (double amount) {
       /* if (this.balance - amount > -10000) {

        }*/
        if (amount < 10000) {
            super.withdraw(amount);
        } else {
            System.out.println("Du kan højst have 10000kr");
        }

    }
}

class Milliondollarbby extends Account {

    Milliondollarbby(String ow, double ir, double startbalance) {
        super (ow, ir);
        super.deposit(startbalance);

    }
    void deposit(double amount) {

        int jackpot = (int) (Math.random()*2+1);
        if (jackpot ==2) {
            super.deposit(amount + 1000000);
            System.out.println("Tillykke med EN million dollarsos min ven");

        } else System.out.println( "Stramt for dig ven");

        }

    }


    class Børneopsparing extends Account {

        LocalDate birthday;

        Børneopsparing(String ow, double ir, double startbalance, LocalDate bd) {
            super(ow, ir);
            super.deposit(startbalance);
            birthday = bd;
        }

        void withdraw(double amount) {
            if (birthday.isAfter(LocalDate.now()))
                System.out.println("Du kan først hæve efter " + birthday);
            else
                super.withdraw(amount);


        }
    }



