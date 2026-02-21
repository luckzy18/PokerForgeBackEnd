package forge.pokerforge.Controller;



import forge.pokerforge.Game.Game;
import forge.pokerforge.Game.GamesStorage;
import forge.pokerforge.Service.ForgeService;
import org.springframework.web.bind.annotation.*;

//import Tour.Service.*;

import java.util.*;
import forge.pokerforge.Game.GamesStorage;

@RestController
@CrossOrigin
public class ForgeController {
    private ForgeService fg;
    private GamesStorage gm;

    public ForgeController(ForgeService fg){
        this.fg=fg;gm=new GamesStorage();
    }

    @GetMapping("/games/actions")
    public String playerAction(String action,int amount){
        String response="ok" ;
        fg.playerAction(action,amount);
        return response;
    }

    @PostMapping("/games/start")
    public Map<String,Object> startGame(){

        Map<String,Object> response=new HashMap<>();
        Game g=new Game(0,0,"easy",1000,"warrior");
        gm.addGame(g);

        response.put("gameId",1);
        return response;
    }


}
