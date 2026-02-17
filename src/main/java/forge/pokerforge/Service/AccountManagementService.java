package forge.pokerforge.Service;
import forge.pokerforge.User.User;
import forge.pokerforge.User.UserRepository;

import org.springframework.stereotype.Component;


@Component
public class AccountManagementService {

    private final UserRepository repo;

    public AccountManagementService(UserRepository repo){
        this.repo=repo;
    }
    public boolean login(String email, String password) {
        return repo.findByEmail(email)
                .map(user -> user.getPassword().equals(password))
                .orElse(false);
    }
    public boolean createAccount(String email, String password) {
        if (repo.existsByEmail(email)){
            return false;
        }
        repo.save(new User(email, password));
        return true;
    }
    public boolean deleteAccount(String email) {
        if (!repo.existsByEmail(email)) {
            return false;
        }
        repo.deleteByEmail(email);
        return true; }


}
