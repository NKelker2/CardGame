import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CardDeck {
    static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    static Map<Integer, String[]> deck = new HashMap<>();
    private Map<Integer, String[]> useDeck = new HashMap<>();

    public CardDeck() {
        createDeck();
        useDeck = deck;
    }

    public void createDeck() {
        Integer runs = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                String[] card = {ranks[j], suits[i]};
                runs ++;
                deck.put(runs, card);
            }
        }
    }

    public void getDeck() {
        useDeck.forEach((key, value) -> System.out.println(key + ":" + Arrays.toString(value)));
    }

    public String[] drawCard() {
        Integer[] key = useDeck.keySet().toArray(new Integer[0]);
        int random = (int)(Math.random() * key.length);
        String[] cardDrawn = deck.get(key[random]);
        deck.remove(key[random]);
        return cardDrawn;
    }

    public void resetDeck() {
        useDeck = deck;
    }
}
