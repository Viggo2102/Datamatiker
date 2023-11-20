package HarrysSalon;

import java.util.ArrayList;

public class Product {

    String name;
    double price;

   /* double cut = 300;
    int shampoo = 100;
    int scissor = 50;
    double hairwax = 59.99;*/

    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + price;
    }

    public double getCut() {
        double cut = 100;
        return cut;
    }

    /*public double shampooAndCut() {
        return shampoo + cut;
    }

    public double scissorAndCut() {
        return scissor + cut;
    }

    public double hairwaxAndCut() {
        return hairwax + cut;
    }*/

    public static void main(String[] args) {
        Product hairCut = new Product("Haircut", 300);
        Product scissor = new Product("Scissor", 50);
        ArrayList<Product> list = new ArrayList<>();
        list.add(hairCut);
        list.add(scissor);

        for (Product p: list) {
            System.out.println(p);
        }
       /* System.out.println(p.shampooAndCut());
        System.out.println(p.scissorAndCut());
        System.out.println(p.hairwaxAndCut());
        System.out.println(p.getCut());*/

    }
}




