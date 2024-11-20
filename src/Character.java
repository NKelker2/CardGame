import java.util.Arrays;
import java.util.Scanner;

public class Character {

    Scanner scanner = new Scanner(System.in);

    public Character() {
    }

    enum Type {
        PLAYER,
        NPC,
        DEALER
    }

    Type character;
    static CardDeck deckInUse;

    public Character(Type characterS, CardDeck deckInUseS) {
        character = characterS;
    }
}
