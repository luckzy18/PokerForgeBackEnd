package Controller;


import Service.ForgeImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import Service.ForgeImp;
//import Tour.Service.*;

import java.time.LocalDate;
import java.util.*;
import java.util.logging.Logger;

@RestController
@CrossOrigin
public class ForgeController {
    private ForgeImp fg;

    public ForgeController(ForgeImp fg){
        this.fg=fg;
    }

    @GetMapping("/games/actions")
    public String PlayerAction(String action,int amount){
        String response="ok" ;
        fg.playerAction(action,amount);
        return response;
    }

}
