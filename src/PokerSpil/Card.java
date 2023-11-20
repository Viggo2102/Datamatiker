package PokerSpil;

/*import Polymorfism_Vehicle.Car;

import java.util.ArrayList;
import java.util.Random;

public class Card {
    Random gen = new Random();

    String suit;
    int rank;

    Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

     public int randomCard() {
         return gen.nextInt(5)+1;
     }

    public static void main(String[] args) {
        ArrayList<Card> deck = new ArrayList<>();
        for (Card c: deck) {

        }
    }
}*/

import java.util.ArrayList;
import java.util.Collections;

// Card class representing a playing card
class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

// Deck class representing a deck of cards
class Deck {
    private ArrayList<Card> cards;  // Using ArrayList for dynamic sizing

    public Deck() {
        cards = new ArrayList<>();

        // Initialize the deck
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Populate the deck
        for (String suit : suits) {
            for (String rank : ranks) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        // Shuffle the deck
        //deck.shuffle();

        // Print the deck using ArrayList
        System.out.println("Deck using ArrayList:");
        deck.printDeck();
    }
}

