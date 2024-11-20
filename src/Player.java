import java.util.Arrays;

class Player extends Character{
    static String[] hand;
    static boolean inPlay = false;
    private String name;
    private double balance;

    public Player(String name, double balance) {
        name = name;
        balance = balance;
        inPlay = true;
    }

    public void playerDraw() {
        hand = deckInUse.drawCard();
        System.out.println(Arrays.toString(hand));
    }

    public void fold() {
        inPlay = false;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}