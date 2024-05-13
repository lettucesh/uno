package entities.defaultCards;

import entities.defaultCards.enums.DefaultCardColors;
import entities.defaultCards.enums.DefaultCardTypes;
import entities.defaultCards.enums.DefaultSpecialCards;

import java.util.ArrayList;
import java.util.List;

public class DefaultSkipCard extends DefaultCard {

    private final DefaultCardTypes type = DefaultCardTypes.SYMBOL;
    private final String cardDescription = "Next player looses turn.";
    private final DefaultSpecialCards cardRule = DefaultSpecialCards.SKIP;

    public DefaultSkipCard(DefaultCardColors color, int score) {
        super(color, score);
    }

    public List<DefaultCard> instanceCards(int amount, DefaultCardColors color, DefaultSpecialCards symbol, int score) {
        List<DefaultCard> cards = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            cards.add(new DefaultSkipCard(color, score));
        }
        return cards;
    }

    @Override
    public String toString() {
        return "DefaultSkipCard{" +
                "type=" + type +
                ", cardDescription='" + cardDescription + '\'' +
                ", cardRule=" + cardRule +
                '}';
    }
}
