package cardGame2;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card>cards = new ArrayList<>();


    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getNumberOfCards() {
        return cards.size();
    }
}
