package cardGame2;

public class CardGame {
    private int numberOfPlayers;

    public CardGame(int numberOfPlayers, int numberOfCardsToDeal) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfPlayers() {
        return this.numberOfPlayers;
    }
}
