package cardGame2;

import org.junit.jupiter.api.Test;

import static cardGame2.Suit.DIAMOND;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    void playerHasAnId(){
        Player player = new Player("Michael");
        assertEquals("Michael", player.getName());
    }

    @Test
    void playerHasCards(){
        Player player = new Player("Michael");
        player.addCard(new Card(DIAMOND, 9));
        player.addCard(new Card(DIAMOND, 5));
        player.addCard(new Card(DIAMOND, 10));
        assertEquals(3, player.getNumberOfCards());
    }
}
