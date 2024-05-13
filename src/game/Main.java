package game;

import entities.defaultCards.DefaultCard;
import entities.defaultCards.enums.DefaultCardColors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<DefaultCard> cards = new ArrayList<>();

        DefaultCardColors[] colors = DefaultCardColors.values();

        DefaultCard defaultGame = new DefaultCard();

        for (DefaultCardColors color : colors) {
            cards.addAll(defaultGame.instanceCards(20, color, 20));
        }

        Collections.shuffle(cards);

        for (DefaultCard card : cards) {
            System.out.println(card);
        }
    }
}
