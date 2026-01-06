package Service;// The REST controller that handles HTTP requests.
// Lives in sub-package controller, marked with the @RestController annotation
// for auto-configuration; the @CrossOrigin annotation enables CORS.



import Game.*;

import java.util.*;

public class ForgeService implements ForgeImp{
    ForgeImp fg;
    GamesComm games=new GamesComm();
    public ForgeService(ForgeImp fg){this.fg=fg;}


    @Override
    public void playerAction(String action, int amount) {

    }
    @Override
    public double startGame(){
        double gameId=games.addGame();
        return gameId;
    }
}
