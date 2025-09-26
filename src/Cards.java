import java.util.ArrayList;

public class Cards {

    public Cards(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    enum Suit {
        Hearts, Clubs, Diamonds, Spades;
        //states factors of a suit

    }

    enum Rank {
        Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
        //states factors of a rank
    }

    final Suit suit;
    final Rank rank;


    public Suit getSuit() {
        return suit;

    }

    public Rank getRank() {
        return rank;
    }
    //returns a suit and rank

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

//this makes a card with the information given, and turns it into a string






