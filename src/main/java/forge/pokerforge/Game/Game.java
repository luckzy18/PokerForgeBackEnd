package forge.pokerforge.Game;

import forge.pokerforge.Game.Player;
import forge.pokerforge.Game.Deck;

public class Game{

    private final int id=0;

    public int getId() {
        return id;
    }
    Deck deck;
    int smallBid;
    int bigBid;
    String difficulty;
    int startMoney;
    Player p;
    Player bot;
    public Game(int smallBid, int bigBid,String difficulty, double startMoney,String user ){
        this.deck=new Deck();
        this.smallBid=smallBid;
        this.bigBid=bigBid;
        this.difficulty=difficulty;
        this.p=new Player(user,startMoney);
        this.bot=new Player(difficulty,startMoney);
        Card[] C=new Card[4];
    }

    public void startGame(){
        deck.dealCards(p);
        deck.dealCards(bot);
        setBigBlind(p);
        setsmallBlind(bot);



        }
        //reset highest round bet
    }


}