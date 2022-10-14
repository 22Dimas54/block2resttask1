package ru.netology.block2resttask1.controller;

import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.netology.block2resttask1.Authorities;
import ru.netology.block2resttask1.User;
import ru.netology.block2resttask1.service.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {
    private AuthorizationService service = new AuthorizationService();

    @PostMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestBody @Validated User user) {
        return service.getAuthorities(user);
    }
}
