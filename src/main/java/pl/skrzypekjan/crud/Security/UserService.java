package pl.skrzypekjan.crud.Security;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import pl.skrzypekjan.crud.Dao.Entity.CurrentUser;
import pl.skrzypekjan.crud.Dao.Entity.User;

import javax.validation.Valid;
import java.util.Arrays;

public interface UserService {
    User findByUserName(String name);
    void saveUser(User user);
    void updateUser(@AuthenticationPrincipal CurrentUser customUser, @Valid User user);

}
