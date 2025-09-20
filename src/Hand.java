public class Hand {
    public static void main (String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        System.out.println("Here ya go!");
        for (int i = 0; i < 7; i++) {
            Cards card = deck.dealCard();
            if (card != null) {
                System.out.println(card);
            }
        }
    }
}

//Main does nothing you would see disappointment if you went there