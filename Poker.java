import CardGame.Card;
import CardGame.CardDeck;

import java.util.ArrayList;
import java.util.List;

public class Poker {

    private List<Card> cards;
    private CardDeck cardDecks;

    public Poker(){
        cards = new ArrayList<>();
        cardDecks = new CardDeck();

        cardDecks.shuffle();

        for (int i = 0; i < 7; i++){
            cards.add(cardDecks.draw());
        }
    }

    public void cardinfo(){
        int pair = 0;
        int triple = 0;
        int fourcard = 0;

        for(int i = 0; i < cards.size(); i++) {
            for (int j = 0; j < cards.size(); j++) {
                if (cards.get(i).getNum() == cards.get(j).getNum())
                    pair++;
            }
            pair -= 1;//(i=j일때) 같은 카드끼리 비교해도 pair가 ++되니까 비교한턴에 하나는 빼줘야함
        }

        if (pair == 1)
            System.out.println("One Pair");
        if (pair == 2)
            System.out.println("Two Pair");

        for(int i = 0; i < cards.size(); i++ ){
            for(int j = 0; j < cards.size();j++){
                for(int k = 0; k < cards.size(); k++){
                    if(cards.get(i).getNum() == cards.get(j).getNum() && cards.get(i).getNum() == cards.get(k).getNum()
                            && cards.get(j).getNum() == cards.get(k).getNum())
                        triple++;
                }
            }
            triple -= 1; //(i=j=k일때) 같은 카드끼리 비교해도 triple이 ++되니까 비교한턴에 하나는 빼줘야함
        }

        if (triple == 1)
            System.out.println("Triple");
        if (pair == 1 && triple == 1)
            System.out.println("Full House");

        for(int i = 0; i < cards.size(); i++ ){
            for(int j = 0; j < cards.size();j++){
                for(int k = 0; k < cards.size(); k++){
                    for(int l = 0; l < cards.size(); l++) {
                        if (cards.get(i).getNum() == cards.get(j).getNum() && cards.get(i).getNum() == cards.get(k).getNum()
                                && cards.get(i).getNum() == cards.get(k).getNum() && cards.get(j).getNum() == cards.get(k).getNum()
                                && cards.get(j).getNum() == cards.get(l).getNum() && cards.get(k).getNum() == cards.get(l).getNum())
                            fourcard++;
                    }
                }
            }
            fourcard -= 1; //(i=j=k=l일때) 같은 카드끼리 비교해도 fourcard가 ++되니까 비교한턴에 하나는 빼줘야함
        }

        if(fourcard == 1)
            System.out.println("Four card");


    }

    public String toString() {
        String s = "";

        for (Card c : cards) {
            s += c.toString();
            s.replace("0", "A");
            s.replace("11", "J");
            s.replace("12", "Q");
            s.replace("13", "K");
        }

        String[] mycard = s.split("/");

        for (int i = 0; i < cards.size(); i++)
            return mycard[i];
    }
}
