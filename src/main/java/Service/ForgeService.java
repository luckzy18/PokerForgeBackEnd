package Service;// The REST controller that handles HTTP requests.
// Lives in sub-package controller, marked with the @RestController annotation
// for auto-configuration; the @CrossOrigin annotation enables CORS.


public class ForgeService implements ForgeImp{
    ForgeImp fg;
    public ForgeService(ForgeImp fg){this.fg=fg;}


    @Override
    public void playerAction(String action, int amount) {

    }
}
