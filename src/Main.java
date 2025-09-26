//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();


        System.out.println("Card Deck Simulation");

        for (int i = 0; i < 7; i++) {
            Cards card = deck.dealCard();
            if (card != null) {
                System.out.println(card);
            }
        }
    }
}

// prints out the array from deck

//Some code is unused due me using it as a setup for my midterm :)