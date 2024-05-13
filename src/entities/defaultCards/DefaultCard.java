package entities.defaultCards;

import entities.defaultCards.enums.DefaultCardColors;
import entities.defaultCards.enums.DefaultCardTypes;

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public DefaultCardColors getColor() {
        return color;
    }

    public void setColor(DefaultCardColors color) {
        this.color = color;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public DefaultCardTypes getType() {
        return type;
    }
}
