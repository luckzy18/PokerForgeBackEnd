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


    public ForgeController(ForgeService fg){
        this.fg=fg;
    }
    @GetMapping("/api/games")
    public String playerAction(){

        return "eureka";
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
        fg.startGame(g);

        response.put("gameId",g.toString());
        return response;
    }


}
