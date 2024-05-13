package entities.defaultCards;

import entities.defaultCards.enums.DefaultCardColors;
import entities.defaultCards.enums.DefaultCardTypes;
import entities.defaultCards.enums.DefaultSpecialCards;

import java.util.ArrayList;
import java.util.List;

public class DefaultCard {

    private final DefaultCardTypes type = DefaultCardTypes.NUMBER;
    private final String cardDescription = "Cards with Numbers 0-9";
    private DefaultCardColors color;
    private int number;
    private int score;

    public DefaultCard(int number, DefaultCardColors color, int score) {
        this.number = number;
        this.color = color;
        this.score = score;
    }

    public DefaultCard(DefaultCardColors color, int score) {
        this.color = color;
        this.score = score;
    }

    public DefaultCard(int score) {
        this.score = score;
    }

    public DefaultCard() {

    }

    public int getNumber() {
        return number;
    }

    public DefaultCardColors getColor() {
        return color;
    }

    public int getScore() {
        return score;
    }

    public DefaultCardTypes getType() {
        return type;
    }

    public List<DefaultCard> instanceCards(int amount, DefaultCardColors color, int score) {
        List<DefaultCard> cards = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            cards.add(new DefaultCard(i % 10, color, score));
        }
        return cards;
    }

    @Override
    public String toString() {
        return "DefaultCard{" +
                "type=" + type +
                ", cardDescription='" + cardDescription + '\'' +
                ", color=" + color +
                ", number=" + number +
                ", score=" + score +
                '}';
    }
}
