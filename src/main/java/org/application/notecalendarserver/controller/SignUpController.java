package org.application.notecalendarserver.controller;

import org.application.notecalendarserver.model.User;
import org.application.notecalendarserver.repository.UserRepository;
import org.application.notecalendarserver.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signUp")
public class SignUpController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public Long signUp(@RequestBody User user) {
        return AuthorizationService.getSignUp(user, userRepository);
    }

}
