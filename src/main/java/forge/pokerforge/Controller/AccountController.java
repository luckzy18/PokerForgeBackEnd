package forge.pokerforge.Controller;

import forge.pokerforge.Service.AccountManagementService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class AccountController {
    private AccountManagementService ac;


    public AccountController(AccountManagementService ac){
        this.ac=ac;
        //connect to a databse probably a h2 probs done in the service
    }

    @GetMapping
    public boolean login(){
        //check email
        return false;
    }

    @PostMapping
    public boolean createAccount(){
        return false;
    }

    @DeleteMapping
    public boolean deleteAccount(){
        return false;
    }



}
