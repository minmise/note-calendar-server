package org.application.notecalendarserver.service;

import org.application.notecalendarserver.model.User;
import org.application.notecalendarserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorizationService {

    public static Long getSignUp(User user, UserRepository userRepository) {
        ExampleMatcher matcher = ExampleMatcher.matching().
                withIgnorePaths("id").
                withMatcher("login", ExampleMatcher.GenericPropertyMatchers.exact()).
                withIgnorePaths("password");
        if (userRepository.exists(Example.of(user, matcher))) {
            return (long) -1;
        }
        userRepository.save(user);
        return user.getId();
    }

    public static Long getSignIn(User user, UserRepository userRepository) {
        ExampleMatcher matcher = ExampleMatcher.matching().
                withIgnorePaths("id").
                withMatcher("login", ExampleMatcher.GenericPropertyMatchers.exact()).
                withMatcher("password", ExampleMatcher.GenericPropertyMatchers.exact());
        List<User> list = userRepository.findAll(Example.of(user, matcher));
        if (list.isEmpty()) {
            return (long) -1;
        }
        return list.get(0).getId();
    }

}
