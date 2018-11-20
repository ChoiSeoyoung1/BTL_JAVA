package CardGame.BlackJack;

import CardGame.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class User {
    // 유저가 가지고 잇는 카드들
    private List<Card> cards;

    // 더이상 카드를 받지 않을 경우 true
    private boolean finish;

    // 사용자가 가지고 있는 금액
    private double money;

    public User(ArrayList user_cards) {

        cards = user_cards;
        finish = false;
        money = 1000;

        /*초기화 부분
        * cards --> 원하는 리스트로
        * finish --> false
        * money --> 기초 시작자금 1000원으로
        * */
    }

    // 카드를 1장 받음 false 리턴
    public boolean hit() {
        return false;
    }

    // 더이상 카드를 받지 않음 true 리턴
    public boolean stand() {
        return true;
    }

    // 돈을 배팅 (한 판에 1번 배팅 기본 100원)
    public void bet(double money) {

        Scanner in = new Scanner(System.in);
        int Betrate = in.nextInt();
        int Betmoney = 0;

        Betmoney = 100 * Betrate;
        money -= Betmoney;


    }

    // 현재 들고있는 총 카드 숫자들의 합
    public void getTotalNum() {
        int TotalNum = 0;

        for(int i = 0; i < cards.size() - 1 ; i++){

            TotalNum += cards.get(i);

        }

    }

    @Override
    public String toString(int TotalNum) {
        // 사용자의 현재 카드정보를 보여줌 --> {(0번카드, 1번카드.... ,i번카드,): 전체 카드숫자의합}
        for(int i = 0 ; i < cards.size() - 1 ; i++){
        cards.get(i);
        return super.toString();
        }
        return "(" + TotalNum + ")";
    }
}
