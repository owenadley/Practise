import java.util.*;

public class Deck {

    private ArrayList<Card> deck;

    public Deck() {

        for (Card.Suit s : Card.Suit.values()) {
            for (Card.Rank r : Card.Rank.values()) {
                Card nc = new Card(s, r);
                deck.add(nc);
            }
        }
    }

    public static void main(String[] args) {

    }
}