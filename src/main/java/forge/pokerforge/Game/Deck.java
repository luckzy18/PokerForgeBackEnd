package forge.pokerforge.Game;
import forge.pokerforge.Game.Player.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
    private final List<Card> cards = new ArrayList<>();
    private int index=0;
    public Deck() { for (Card.Suit suit : Card.Suit.values()) {
        for (Card.Rank rank : Card.Rank.values())
        { cards.add(new Card(suit, rank)); } }
        Collections.shuffle(cards); }

    public void dealCards(Player p){
        Card[] cards={this.oneCard(),this.oneCard()};
        p.setCards(cards);
    }
    private Card oneCard(){
        Card c=cards.get(index);
        index+=1;
        return c;
    }
    private void burnCard(){
        index+=1;
    }

}
