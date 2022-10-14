package ru.netology.block2resttask1;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private final String NAME_USER = "admin";
    private final String PASSWORD_USER = "admin";

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equals(NAME_USER) & password.equals(PASSWORD_USER)) {
            List<Authorities> authorities = new ArrayList<>();
            authorities.add(Authorities.DELETE);
            authorities.add(Authorities.WRITE);
            authorities.add(Authorities.READ);
            return authorities;
        }
        return null;
    }
}
