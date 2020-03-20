package pl.skrzypekjan.crud.Controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.skrzypekjan.crud.Dao.Entity.CurrentUser;
import pl.skrzypekjan.crud.Dao.Entity.User;

@Controller
@RequestMapping("")
public class LoginController {

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String login() {
        return "admin/login";
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String newHope() {
        return "category/add";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin(@AuthenticationPrincipal CurrentUser customUser) {
        User entityUser = customUser.getUser();
        return "this is user id " +entityUser.getId() ;
    }
}
