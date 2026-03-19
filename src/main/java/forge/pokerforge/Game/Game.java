package forge.pokerforge.Game;

import forge.pokerforge.Game.Player.*;

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
    Player player;
    private Card[] floor;
    String gameHistory;
    //need to be concise and able to unpack
    Player bot;
    public Game(int smallBid, int bigBid,String difficulty, double startMoney,String user ){
        this.deck=new Deck();
        this.smallBid=smallBid;
        this.bigBid=bigBid;
        this.difficulty=difficulty;
        this.player=new UserPlayer(user,startMoney);
        this.bot=new BotPlayer(difficulty,startMoney,"Easy");
        this.floor=new Card[4];

    }
    public void gameStart(){
        player.bet(smallBid);
        bot.bet(bigBid);

    }

    public void betRound(){
        deck.dealCards(player);
        deck.dealCards(bot);
        }
        //reset highest round bet
    }



