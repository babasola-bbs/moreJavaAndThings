package cardGame2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CardGameTest {

    @Test
    void cardGameCanBeCreated(){
        CardGame cardGame = new CardGame(2, 5);
        assertNotNull(cardGame);
    }

    @Test
    void gameIsInitializedWithNumberOfPlayer(){
        CardGame cardGame = new CardGame(2, 5);
        assertEquals(2, cardGame.getNumberOfPlayers());
    }
}
