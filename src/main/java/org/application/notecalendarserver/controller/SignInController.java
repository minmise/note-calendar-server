package org.application.notecalendarserver.controller;

import org.application.notecalendarserver.model.User;
import org.application.notecalendarserver.repository.UserRepository;
import org.application.notecalendarserver.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/signIn")
public class SignInController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public Long signIn(@RequestBody User user) {
        return AuthorizationService.getSignIn(user, userRepository);
    }

}
