package com.xyx.aitbot.controller;

import com.xyx.aitbot.model.User;
import com.xyx.aitbot.repository.UserRepository;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class UserController {

    @Resource
    private UserRepository userRepository;

    @PostMapping("login")
    public boolean login(String email, String password) {
        User user = userRepository.findById(email).orElse(null);
        if (user != null) {
            return user.getPassword().equals(password) && user.getStatus() == 1;
        }
        return false;
    }


}
