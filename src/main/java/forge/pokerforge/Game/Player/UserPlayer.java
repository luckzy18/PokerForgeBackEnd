package forge.pokerforge.Game.Player;

public class UserPlayer extends Player{
    public UserPlayer(String username,double money){
        super(username,money);
    }

    @Override
    public void bet(int money) {
        System.out.println(10);
    }
}
