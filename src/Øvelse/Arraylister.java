package Øvelse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylister {
    public static void main(String[] args) {

       ArrayList<Integer> numbers = new ArrayList<>();
       ArrayList<String> food = new ArrayList<>();

       numbers.add(13);
       numbers.add(12);
       numbers.add(5);

       food.add("Hamburger");
       food.add("Pizza");
       food.add("Milk");

       System.out.println("Numbers: " + numbers);

        Reverse(numbers);
        System.out.println("reverse numbers: " + numbers);

        System.out.println("Food: " + food);

        }

    public static void Reverse(ArrayList<Integer> hej) {

        Collections.reverse(hej);

    }


}
