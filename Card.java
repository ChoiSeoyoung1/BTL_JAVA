package CardGame;

public class Card {
    private String suit;
    private int num;

    public Card(String suit, int num) {
        this.suit = suit;
        this.num = num;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {

        return  suit + num +"/" ;
    }
}
