package entities.defaultCards;

import entities.defaultCards.enums.DefaultCardColors;
import entities.defaultCards.enums.DefaultCardTypes;
import entities.defaultCards.enums.DefaultSpecialCards;

public class DefaultReverseCard extends DefaultCard {

    private final DefaultCardTypes type = DefaultCardTypes.SYMBOL;
    private final String cardDescription = "Reverses direction of play.";
    private final DefaultSpecialCards cardRule = DefaultSpecialCards.REVERSE;

    public DefaultReverseCard(DefaultCardColors color, int score) {
        super(color, score);
    }
}
