package cardGame2;


import cardGame2.exceptions.InvalidCardValueException;

public class Card {
    private final int value;
    private final Suit suit;

    public Card(Suit suit, int value) {
        if(value < 1 || value > 13){
            throw new InvalidCardValueException(value + " is an invalid number");
        }

        this.value = value;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getValue() {
        return switch (this.value) {
            case 1 -> "Ace";
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> "" + value;
        };
    }

    @Override
    public String toString(){
        return getValue()+ " Of " + suit.toString();
    }

    @Override
    public boolean equals(Object obj){
        if (!this.getClass().equals(obj.getClass())){
            return false;
        }
        Card cardToCompare = (Card) obj;
        if (this.value == cardToCompare.value || this.suit == cardToCompare.suit){
            return true;
        }
         return false;
    }
}
