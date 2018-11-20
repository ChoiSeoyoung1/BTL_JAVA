package CardGame.BlackJack;

import CardGame.Card;
import CardGame.CardDeck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealer {

    // 딜러가 가지고 있는 카드
    private List<Card> cards;
    // 딜러가 가지고 있는 카드 덱 (사용자에게 덱에서 1장씩 나눠줌)
    private CardDeck cardDecks;


    public Dealer(CardDeck a){

        cardDecks = a;

        cards = new ArrayList<>();

        cards.add(cardDecks.draw());
        cards.add(cardDecks.draw());

    }
    /*초기화부분
     * cards --> 원하는 리스트로
     * cardDeck --> 구현한 CardDeck으로 초기화
     * */



    // 유저들에게 카드를 나눠 줌 유저를 입력으로 받고, 카드덱에서 카드를 뽑아 카드를 건네줌.
    public void handOut() {
        Scanner in = new Scanner(System.in);
        int userNum = in.nextInt();

        for(int i = 0; i < userNum - 1; i++){

            cardDecks.draw();
            cardDecks.draw();

            ArrayList user_cards = new ArrayList(); // user_i 이렇게 만들고 싶은데 어떻게..?
            user_cards.add(cardDecks.draw());
            user_cards.add(cardDecks.draw());

        }
    }

    public void cards_sum(){
        int cards_sum = 0;

        for (int i = 0; i < cards.size() - 1 ; i++) {

            cards_sum += cards.get(i);
            // 딜러의 카드들의 num 값을 더하고 싶은데 어떻게..?
        }
    }

    // 딜러의 현재 카드 수의 합이 16 이하이면 무조권 1장 받아옴 false 리턴
    public boolean hit(int cards_sum) {

        if (cards_sum <= 16) {
            cardDecks.draw();
            cards.add(cardDecks.draw());
        }

        return false;
    }

    // 딜러의 카드 수의 합이 17 이상이면 statnd, true 리턴
    public boolean stand(int cards_sum) {

        if (cards_sum >= 17){

        }
            return true;
    }

    @Override
    public String toString() {
        // 딜러의 현재 카드를 보여줌 --> 0번쨰 카드는 * 처리(숨김) 1번째 카드는 card의 toString이용
        cards.get(0);
        return {"( * , * )";}

        cards.get(1);
        return super.toString();
    }
}