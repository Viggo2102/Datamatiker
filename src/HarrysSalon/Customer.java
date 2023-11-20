package HarrysSalon;

import java.util.ArrayList;

public class Customer {
    String name;
    int phonenumber;
    double balance;

    public Customer(String name, int phonenumber, double balance) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + "\t" + phonenumber + "\t"  + balance;
    }


    public static void main(String[] args) {
        System.out.println("Name" + "\t" + "Phonenumber" + "\t" + "OwesUs");
        Customer c1 = new Customer("Viktor", 51111111, -200);
        Customer c2 = new Customer("Per", 21029723, 0);

        ArrayList<Customer> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        for (Customer c: list) {
            System.out.println(c);
        }

    }
}

