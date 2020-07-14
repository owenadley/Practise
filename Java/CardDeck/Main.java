
public class Main {
    
    public static void main(String[] args) {

        Card card = new Card(Card.Suit.CLUBS, Card.Rank.ACE);
        Deck deck = new Deck();

        System.out.println(deck);

    }


}