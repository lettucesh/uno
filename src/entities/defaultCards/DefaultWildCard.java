package entities.defaultCards;

import entities.defaultCards.enums.DefaultCardTypes;
import entities.defaultCards.enums.DefaultSpecialCards;

import java.util.ArrayList;
import java.util.List;

public class DefaultWildCard extends DefaultCard {

    private final DefaultCardTypes type = DefaultCardTypes.WILD;
    private String cardDescription;
    private DefaultSpecialCards cardRule;
    private int score;

    public DefaultWildCard(DefaultSpecialCards cardRule, int score) {
        super(score);
        if (cardRule == DefaultSpecialCards.DRAW_FOUR) {
            this.cardDescription = "Next player draws 4";
        } else if (cardRule == DefaultSpecialCards.CHANGE_COLOR) {
            this.cardDescription = "Changes color.";
        }
        this.cardRule = cardRule;
    }

    public String getCardDescription() {
        return cardDescription;
    }

    public DefaultSpecialCards getCardRule() {
        return cardRule;
    }

    public int getScore() {
        return score;
    }

    public List<DefaultCard> instanceCards(int amount, DefaultSpecialCards wild, int score) {
        List<DefaultCard> cards = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            cards.add(new DefaultWildCard(wild, score));
        }
        return cards;
    }

    @Override
    public String toString() {
        return "DefaultWildCard{" +
                "type=" + type +
                ", cardDescription='" + cardDescription + '\'' +
                ", cardRule=" + cardRule +
                ", score=" + score +
                '}';
    }
}
