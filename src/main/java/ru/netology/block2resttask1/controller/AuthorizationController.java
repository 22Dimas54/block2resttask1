package ru.netology.block2resttask1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.block2resttask1.Authorities;
import ru.netology.block2resttask1.service.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {
    private AuthorizationService service = new AuthorizationService();

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
}
