package forge.pokerforge.Controller;

import forge.pokerforge.DTO.CreateAccountRequest;
import forge.pokerforge.Service.AccountManagementService;
import org.springframework.web.bind.annotation.*;
import forge.pokerforge.DTO.LoginRequest;

@RestController
@CrossOrigin
public class AccountController {
    private final AccountManagementService ac;


    public AccountController(AccountManagementService ac){
        this.ac=ac;
        //connect to a databse probably a h2 probs done in the service
    }

    @PostMapping("/login")
    public boolean login(@RequestBody LoginRequest loginRequest){
        return ac.login(loginRequest.getEmail(),loginRequest.getPassword());
    }

    @PostMapping("/Register")
    public boolean createAccount(@RequestBody CreateAccountRequest createAccountRequest){
        return ac.createAccount(createAccountRequest.getEmail(), createAccountRequest.getPassword());
    }

//    @DeleteMapping("/{email}")
//    public boolean deleteAccount(@PathVariable String email){
//        return ac.deleteAccount(email);
//    }



}
