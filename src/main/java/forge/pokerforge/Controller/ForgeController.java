package forge.pokerforge.Controller;



import forge.pokerforge.Service.ForgeService;
import org.springframework.web.bind.annotation.*;

//import Tour.Service.*;

import java.util.*;

@RestController
@CrossOrigin
public class ForgeController {
    private ForgeService fg;

    public ForgeController(ForgeService fg){
        this.fg=fg;
    }

    @GetMapping("/games/actions")
    public String playerAction(String action,int amount){
        String response="ok" ;
        fg.playerAction(action,amount);
        return response;
    }
    @GetMapping("/test")
    public String test(){
        System.out.println("this method works!");
        return "this method works";
    }

    @PostMapping("/games/start")
    public Map<String,Object> startGame(){

        Map<String,Object> response=new HashMap<>();
        //double gameSession=fg.startGame();

        response.put("gameId",1);
        return response;
    }

}
