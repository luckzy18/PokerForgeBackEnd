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
    Card[] floor;
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
    public void gameHand(){
        player.bet(smallBid);
        bot.bet(bigBid);
        betRound();
        if(checkForFoldANDAllIn()){
            return;
        }
        flop();
        betRound();
        if(checkForFoldANDAllIn()){
            return;
        }
        turn();
        betRound();
        if(checkForFoldANDAllIn()){
            return;
        }
        river();
        betRound();
    }

    private void turn(){
        deck.dealTurn(this.floor);
    }
    private void river(){
        deck.dealRiver(this.floor);
    }
    private void flop(){
        deck.dealFlop(this.floor);
    }
    public boolean checkForFoldANDAllIn(){
        return false;
    }

    public void betRound(){
        deck.dealCards(player);
        deck.dealCards(bot);

        }
        //reset highest round bet
    }



