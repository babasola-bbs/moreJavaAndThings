package cardGame2;

import cardGame2.exceptions.InvalidCardValueException;
import org.junit.jupiter.api.Test;

import static cardGame2.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

public class cardTest {

    @Test
    void diamondCanBeCreated(){
        Card card = new Card(DIAMOND, 2);
        assertSame(DIAMOND, card.getSuit());
    }

    @Test
    void spadeCanBeCreated(){
        Card card = new Card(SPADE, 2);
        assertSame(SPADE, card.getSuit());
    }

    @Test
    void heartCanBeCreated(){
        Card card = new Card(HEART, 2);
        assertSame(HEART, card.getSuit());
    }

    @Test
    void clubCanBeCreated(){
        Card card = new Card(Suit.CLUB, 2);
        assertSame(CLUB, card.getSuit());
    }

    @Test
    void aceCanBeCreated(){
        Card card = new Card(Suit.CLUB, 1);
        assertEquals("Ace", card.getValue());
    }

    @Test
    void jackCanBeCreated(){
        Card card = new Card(Suit.CLUB, 11);
        assertEquals("Jack", card.getValue());
    }

    @Test
    void queenCanBeCreated(){
        Card card = new Card(Suit.CLUB, 12);
        assertEquals("Queen", card.getValue());
    }

    @Test
    void kingCanBeCreated(){
        Card card = new Card(Suit.CLUB, 13);
        assertEquals("King", card.getValue());
    }

    @Test
    void otherNumbersCanBeCreated(){
        Card card = new Card(Suit.CLUB, 8);
        assertEquals("8", card.getValue());
    }

    @Test
    void invalidCardExceptionIsThrownWhenValueIsInvalid(){
        assertThrows(InvalidCardValueException.class, ()->new Card(DIAMOND, 14));
        //assertSame(InvalidCardValueException.class, ()->new Card(DIAMOND, 0));
    }

    @Test
    void needlessToStringTest(){
        Card card = new Card(DIAMOND, 13);
        String expectedToString = "King Of Diamond";
        assertEquals(expectedToString, card.toString());
    }

    @Test
    void sameCardValueEquals(){
        Card kingOfSpade = new Card(SPADE, 13);
        Card kingOfHeart = new Card(HEART, 13);
        assertEquals(kingOfHeart, kingOfSpade);
    }

    @Test
    void sameSuitValueEquals(){
        Card kingOfSpade = new Card(SPADE, 13);
        Card queenOfSpade = new Card(SPADE, 12);
        assertEquals(kingOfSpade, queenOfSpade);
        CardDeck cardDeck = new CardDeck(4);
        assertNotEquals(kingOfSpade, cardDeck);
    }

}
