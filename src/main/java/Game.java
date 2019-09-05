import java.util.ArrayList;

public class Game {
    private Object deck;
    private ArrayList<Player> players;

    public Game(Deck deck) {
        this.deck = deck;
        this.players = new ArrayList<Player>();

    }

}
