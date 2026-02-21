package forge.pokerforge.Game;

import java.util.HashMap;
import java.util.Map;

public class GamesStorage{

    private Map<Integer,Game> games =new HashMap<>();

    public GamesStorage(){

    }

    public void addGame(Game game){
        games.put(game.getId(),game);
    }

}