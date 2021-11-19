package cardGame2;

import cardGame2.exceptions.StackOverFlowException;
import cardGame2.exceptions.StackUnderFlowException;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;

public class CardDeck {
    private static Card[] cards;
    private static int lastPushLocation = -1;

    public CardDeck(int numberOfCards) {
        cards = new Card[numberOfCards];
    }

    public static Card peek() {
        if(isEmpty()) throw new StackUnderFlowException("Card Deck Is Empty");
        return cards[lastPushLocation];
    }

    public int getSize() {
        return cards.length;
    }

    public void push(Card card) {
        if (isFull()) throw new StackOverFlowException("Card Deck Is Full");
        lastPushLocation++;
        cards[lastPushLocation] = card;     //cards[++lastPushLocation] = card;
    }

    public Card pop() {
        if(isEmpty()) throw new StackUnderFlowException("Card Deck Is Empty");
        return cards[lastPushLocation--];

//        try{
//            return cards[lastPushLocation--];
//        }
//        catch (ArrayIndexOutOfBoundsException ex){
//            throw new StackUnderFlowException("Card Stack Is Empty");
//        }

//        Card poppedCard = cards[lastPushLocation];
//        cards[lastPushLocation--] = null;
//        return poppedCard;
    }

    public static boolean isEmpty() {
        // return lastPushLocation == -1;
        if (lastPushLocation == -1)return true;
        else{ return false;}
    }

    public boolean isFull() {
        if (lastPushLocation == getSize()-1) return true;
        return false;
    }

    public void shuffle() {
        SecureRandom randomNumber = new SecureRandom();
        int number = randomNumber.nextInt(cards.length);
        for (int i = 0; i < cards.length; i++){
            Card holding = cards[i];
            cards[i] = cards[number];
            cards[number] = holding;
        }
        Collections.shuffle(Arrays.asList(cards));
    }
}
