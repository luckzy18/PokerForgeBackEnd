package forge.pokerforge.Game.Player;

public class BotPlayer extends Player{

    public BotPlayer(String username,double money,String difficulty){
        super(username,money);
    }

    @Override
    public void bet(int money) {
        System.out.println(10);
    }
}
