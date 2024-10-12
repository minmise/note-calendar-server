package org.application.notecalendarserver.controller;

import org.application.notecalendarserver.model.User;
import org.application.notecalendarserver.repository.UserRepository;
import org.application.notecalendarserver.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signIn")
public class SignInController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public Long signIn(@RequestBody User user) {
        return AuthorizationService.getSignIn(user, userRepository);
    }

}
