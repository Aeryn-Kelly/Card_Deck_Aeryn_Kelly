import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public List<Cards> cards;


    public Deck() {


        cards = new ArrayList<>();
        for (Cards.Suit suit : Cards.Suit.values()) {
            for (Cards.Rank rank : Cards.Rank.values()) {
                cards.add(new Cards(suit, rank));
            }
        }
    }
    //makes an array from cards

    public void shuffle() {
        Collections.shuffle(cards);
    //shuffles deck
    }

    public Cards dealCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }
    //makes it so you cant get a card when deck is empty

    public List<Cards> getCards() {
        return new ArrayList<>(cards);
    }
}

//this takes the cards shuffles them and returns the card list array
