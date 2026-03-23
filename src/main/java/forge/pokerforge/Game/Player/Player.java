package forge.pokerforge.Game.Player;
import forge.pokerforge.Game.Card;

public abstract class Player {
    private final String username;

    private double money;

    private boolean betTurn=false;
    private Card[] cards=new Card[2];

    public Player(String username,double money){
        this.username=username;
        this.money=money;

    }
    public void setMoney(double money){
        this.money=money;
    }
    public void setCards(Card[] c){
        this.cards=c;
    }

    public void setBetTurn(boolean betTurn){
    this.betTurn=betTurn;
    }
    public abstract void bet(int money);
}
