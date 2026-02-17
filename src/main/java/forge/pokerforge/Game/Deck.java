package forge.pokerforge.Game;
import forge.pokerforge.Game.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;


public class Deck {
    private final List<Card> cards = new ArrayList<>();
    public Deck() { for (Card.Suit suit : Card.Suit.values()) {
        for (Card.Rank rank : Card.Rank.values())
        { cards.add(new Card(suit, rank)); } }
        Collections.shuffle(cards); }



}
