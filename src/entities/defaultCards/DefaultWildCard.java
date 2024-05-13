package entities.defaultCards;

import entities.defaultCards.enums.DefaultCardTypes;
import entities.defaultCards.enums.DefaultSpecialCards;

public class DefaultWildCard {

    private final DefaultCardTypes type = DefaultCardTypes.WILD;
    private String cardDescription;
    private DefaultSpecialCards cardRule;
    private int score;

    public DefaultWildCard(String cardDescription, DefaultSpecialCards cardRule, int score) {
        this.cardDescription = cardDescription;
        this.cardRule = cardRule;
        this.score = score;
    }

    public String getCardDescription() {
        return cardDescription;
    }

    public void setCardDescription(String cardDescription) {
        this.cardDescription = cardDescription;
    }

    public DefaultSpecialCards getCardRule() {
        return cardRule;
    }

    public void setCardRule(DefaultSpecialCards cardRule) {
        this.cardRule = cardRule;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
