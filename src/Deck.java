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

public void shuffle() {
        Collections.shuffle(cards);

}

public Cards dealCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }

    public List<Cards> getCards() {
        return new ArrayList<>(cards);
    }

}
