package entities.defaultCards;

import entities.defaultCards.enums.DefaultCardColors;
import entities.defaultCards.enums.DefaultCardTypes;
import entities.defaultCards.enums.DefaultSpecialCards;

import java.util.ArrayList;
import java.util.List;

public class DefaultReverseCard extends DefaultCard {

    private final DefaultCardTypes type = DefaultCardTypes.SYMBOL;
    private final String cardDescription = "Reverses direction of play.";
    private final DefaultSpecialCards cardRule = DefaultSpecialCards.REVERSE;

    public DefaultReverseCard(DefaultCardColors color, int score) {
        super(color, score);
    }

    public List<DefaultCard> instanceCards(int amount, DefaultCardColors color, DefaultSpecialCards symbol, int score) {
        List<DefaultCard> cards = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            cards.add(new DefaultReverseCard(color, score));
        }
        return cards;
    }

    @Override
    public String toString() {
        return "DefaultReverseCard{" +
                "type=" + type +
                ", cardDescription='" + cardDescription + '\'' +
                ", cardRule=" + cardRule +
                '}';
    }
}
