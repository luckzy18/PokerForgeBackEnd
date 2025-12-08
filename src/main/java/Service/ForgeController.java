package Service;// The REST controller that handles HTTP requests.
// Lives in sub-package controller, marked with the @RestController annotation
// for auto-configuration; the @CrossOrigin annotation enables CORS.


import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ForgeController {
    Forger fg;
    public ForgeController(Forger fg){this.fg=fg;}




}
