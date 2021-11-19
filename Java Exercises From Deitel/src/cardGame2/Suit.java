package cardGame2;

public enum Suit {
    DIAMOND, SPADE, HEART, CLUB;

    @Override
    public String toString(){
        return switch(this){
            case CLUB -> "Club";
            case HEART -> "Heart";
            case SPADE -> "Spade";
            case DIAMOND -> "Diamond";
        };
    }
}
