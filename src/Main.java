import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        System.out.println(Arrays.toString(deck.drawCard()));
        System.out.println(Arrays.toString(deck.drawCard()));
        System.out.println(Arrays.toString(deck.drawCard()));
    }
}