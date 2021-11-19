package cardGame2;

import cardGame2.exceptions.StackOverFlowException;
import cardGame2.exceptions.StackUnderFlowException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static cardGame2.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CardDeckTest {

    private CardDeck cardDeck;

    @BeforeEach
    void setUp() {
        cardDeck = new CardDeck(4);
    }

    @Test
    void cardDeckHasFixedSize() {
        CardDeck cardDeck = new CardDeck(4);
        assertEquals(4, cardDeck.getSize());
    }

    @Test
    void pushOnce_elementPushedShouldBeLast() {
        Card card = new Card(DIAMOND, 4);
        cardDeck.push(card);
        assertSame(card, CardDeck.peek());
    }

    @Test
    void pushTwice_popOnce_peek_shouldReturnFirstElement() {
        Card firstCard = new Card(SPADE, 5);
        Card secondCard = new Card(DIAMOND, 7);
        cardDeck.push(firstCard);
        cardDeck.push(secondCard);
        Card poppedCard = cardDeck.pop();

        assertSame(secondCard, poppedCard);
        assertSame(firstCard, CardDeck.peek());
    }

    @Test
    void popEmptyCardDeck_throwsStackUnderFlowException() {
        assertTrue(cardDeck.isEmpty());
        assertThrows(StackUnderFlowException.class, () -> cardDeck.pop());
    }

    @Test
    void pushIntoFullDeck_throwsStackOverFlowException() {
        Card card = new Card(SPADE, 4);
        for (int i = 0; i < 4; i++) {
            cardDeck.push(card);
        }
        assertTrue(cardDeck.isFull());
        assertThrows(StackOverFlowException.class, () -> cardDeck.push(card));
    }

    @Test
    void peekingEmptyCardDeck_throwsStackUnderFlowException() {
        assertTrue(cardDeck.isEmpty());
        assertThrows(StackUnderFlowException.class, () -> cardDeck.peek());
    }

    @Test
    void cardDeck_Can_Shuffle_Cards(){
        Card firstCard = new Card(SPADE, 5);
        Card secondCard = new Card(DIAMOND, 7);
        Card thirdCard = new Card(HEART, 2);
        cardDeck.push(firstCard);
        cardDeck.push(secondCard);
        cardDeck.push(thirdCard);
        assertSame(thirdCard, cardDeck.peek());

        cardDeck.shuffle();

        assertNotSame(thirdCard, cardDeck.peek());
    }
}
