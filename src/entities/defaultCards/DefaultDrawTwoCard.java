package entities.defaultCards;

import entities.defaultCards.enums.DefaultCardColors;
import entities.defaultCards.enums.DefaultCardTypes;
import entities.defaultCards.enums.DefaultSpecialCards;

public class DefaultDrawTwoCard extends DefaultCard {

    private final DefaultCardTypes type = DefaultCardTypes.SYMBOL;
    private final String cardDescription = "Next player draws 2 cards.";
    private final DefaultSpecialCards cardRule = DefaultSpecialCards.DRAW_TWO;

    public DefaultDrawTwoCard(DefaultCardColors color, int score) {
        super(color, score);
    }
}
