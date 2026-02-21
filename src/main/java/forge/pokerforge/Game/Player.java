package forge.pokerforge.Game;

public class Player {
    private final String username;

    private double money;

    public Player(String username,double money){
        this.username=username;
        this.money=money;
    }
    public void setMoney(double money){
        this.money=money;
    }
}
