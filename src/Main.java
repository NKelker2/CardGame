import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        deck.getDeck();
        System.out.println(Arrays.toString(deck.drawCard()));
        System.out.println(Arrays.toString(deck.drawCard()));
        System.out.println(Arrays.toString(deck.drawCard()));
        deck.resetDeck();
    }
}