package org.application.notecalendarserver.controller;

import org.application.notecalendarserver.model.User;
import org.application.notecalendarserver.repository.UserRepository;
import org.application.notecalendarserver.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/signUp")
public class SignUpController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    Long signUp(@RequestBody User user) {
        return AuthorizationService.getSignUp(user, userRepository);
    }

}
