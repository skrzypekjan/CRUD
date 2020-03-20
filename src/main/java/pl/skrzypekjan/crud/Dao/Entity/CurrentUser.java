package pl.skrzypekjan.crud.Dao.Entity;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class CurrentUser extends User {
    private final pl.skrzypekjan.crud.Dao.Entity.User user;
    public CurrentUser(String username, String password, Collection<?
            extends GrantedAuthority> authorities,
                       pl.skrzypekjan.crud.Dao.Entity.User user) {
        super(username, password, authorities); this.user = user;
    }
    public pl.skrzypekjan.crud.Dao.Entity.User getUser() {return user;}
}