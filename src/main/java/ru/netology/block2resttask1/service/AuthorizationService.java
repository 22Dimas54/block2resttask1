package ru.netology.block2resttask1.service;

import ru.netology.block2resttask1.Authorities;
import ru.netology.block2resttask1.UserRepository;
import ru.netology.block2resttask1.exception.InvalidCredentials;
import ru.netology.block2resttask1.exception.UnauthorizedUser;

import java.util.List;

public class AuthorizationService {
    private UserRepository userRepository = new UserRepository();

    public List<Authorities> getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
