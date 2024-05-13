package entities.defaultCards;

import entities.defaultCards.enums.DefaultCardColors;
import entities.defaultCards.enums.DefaultCardTypes;
import entities.defaultCards.enums.DefaultSpecialCards;

public class DefaultSkipCard extends DefaultCard {

    private final DefaultCardTypes type = DefaultCardTypes.SYMBOL;
    private final String cardDescription = "Next player looses turn.";
    private final DefaultSpecialCards cardRule = DefaultSpecialCards.SKIP;

    public DefaultSkipCard(DefaultCardColors color, int score) {
        super(color, score);
    }
}
