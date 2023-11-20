package BankApp;

import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp2 {
    public static void main(String[] args) {

        Account a1=new Account("Viktor Rasmussen", 5); //Heroppe kn vi definere variabler fra vores nye klasse "Account"//Værdien består ovenover af 4 komponenter, AccountNo, Owner, balance og Interestrate.
        Account a2=new Account("Lord Nelson", 7); //5 og 7 tallet er renter de hver især har.

        //a1.balance =100;
        a1. deposit(200); //Det ehr er nede fra deposit metoden længere nede.
        a1.withdraw(100);

        //Det her er samme måde som at skrive det på ovenstånde, derfor vi udkommenterer det.
        // a1.accountNo =1;
        // a1.owner = "Viktor Rasmussen";
        // a1.balance = 0;
       //  a1.interestRate = 5;

        //a2.accountNo = 2;
        //a2.owner = "Lord Nelson";
        //a2.balance = 0;
        //a2.interestRate = 7;

        /*System.out.println(a1); //Dette er en toString metode som fylder mindre. man kan også bruge den under her med SOUT.
        System.out.println(a2);*/
        a1.annualInterest(); // rentetilskrivninger.
        a2.annualInterest();

        a1.printTransactions();
        a2.printTransactions();
        // System.out.println("KontoNr: " + a1.accountNo + "\t" +a1.owner + "\t" + a1.balance);

        //System.out.println( "KontoNr: "+a1.accountNo);
        //System.out.println("Ejer: " + a1.owner);
        //System.out.println("Indestående: " + a1.balance);


    } //MAIN
}

class Account { //Her laver vi en ny klasse, hvor vi selv kan definere. Man kan kun have en public class i hver fil, deror har vi ikke piblic med her.
    //Denne her class Account blev lavet efter vi havde angivet en main metode, og inden datatyperne blev defineret i main klassen.
    protected static int noOfAccounts=0; //Static gør at det er unik, de andre variabler vil der være kopier af i begge accounts i det her tilfælde (a1 og a2).
    protected int accountNo; //Dette er instansvariabler.
    protected String owner;
    protected double balance; //INDESTÅENDE   // Private her gør at det kun er fra denne klasse (account) der kan redigeres i "balance i dette tilfælde.
    protected double interestRate;  //Årlig rente i procent
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    Account(String ow, double ir) {//Dette er en constructor.
        noOfAccounts++;

        //Dette er ikke de samme variabler som vi har defineret ovenover.
        accountNo = noOfAccounts;
        owner = ow;
        interestRate = ir;
        balance = 0;
    }

    //Ny metode Denne skal være i en ny og ikke i andre class scopes.

    void deposit( double amount) { // Ny metode der modtger parametre.
        balance = balance +  amount;
        transactions.add(new Transaction("Indsat", amount, balance));
    }

    void withdraw(double amount) {
        balance = balance - amount;
        transactions.add(new Transaction("Hævet", amount, balance));
    }

    void annualInterest () { //Her smider vi renter på.
        double amount = balance * interestRate/100;
        balance = balance + amount;
        transactions.add(new Transaction("Renter", amount, balance));

    }

    void printTransactions() {//Metode der
        System.out.println(this); // this refererer til objektet oppe i mvores main class.
        System.out.println("Tekst \t Dato \t\t Beløb \t Saldo");
        for (Transaction t: transactions)
            System.out.println(t);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Account no: "+ accountNo + "\t" + owner + "\t" + balance;
    }




}//Class

class Transaction {
    String text; //Permanente variabler.
    LocalDate date;
    double amount;
    double newBalance;


   Transaction (String text, double amount, double newBalance) { //Constructor. Initialiserer instansvariablerne.
       this.text = text;  // De her variabler er ikke ens med dem ovenover fra class.
       this.amount = amount;
       this.newBalance = newBalance;
       date = LocalDate.now();

   } //Konstruktør

    @Override
    public String toString() {
       return text + "\t" + date + "\t" + amount + "\t" + newBalance;
    }


} //Transaction