import java.util.ArrayList;

public class Cards {

    public Cards(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    enum Suit {
        Hearts, Clubs, Diamonds, Spades;


    }

    enum Rank {
        Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King

    }

    final Suit suit;
    final Rank rank;


    public Suit getSuit() {
        return suit;

    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}








