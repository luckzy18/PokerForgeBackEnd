package forge.pokerforge.Service;// The REST controller that handles HTTP requests.
// Lives in sub-package controller, marked with the @RestController annotation
// for auto-configuration; the @CrossOrigin annotation enables CORS.

import forge.pokerforge.Game.*;
import forge.pokerforge.Game.GamesComm;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
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
