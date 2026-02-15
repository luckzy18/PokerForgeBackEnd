package Controller;



import Service.ForgeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;


//import Tour.Service.*;

import java.time.LocalDate;
import java.util.*;
import java.util.logging.Logger;

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

    @PostMapping("/games/start")
    public double startGame(){
        double gameSession=fg.startGame();

        return gameSession;

    }

}
