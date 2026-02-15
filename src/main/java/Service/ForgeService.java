package Service;// The REST controller that handles HTTP requests.
// Lives in sub-package controller, marked with the @RestController annotation
// for auto-configuration; the @CrossOrigin annotation enables CORS.



import Game.*;

import java.util.*;

public class ForgeService {

    GamesComm games=new GamesComm();
    public ForgeService(){}



    public void playerAction(String action, int amount) {

    }

    public double startGame(){
        double gameId=games.addGame();
        return gameId;
    }
}
