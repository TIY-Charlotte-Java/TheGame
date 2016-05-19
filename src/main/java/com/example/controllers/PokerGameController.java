package com.example.controllers;

import com.example.entities.Game;
import com.example.entities.User;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ultramar on 5/17/16.
 */
@Controller
public class PokerGameController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public String greeting(String message) throws Exception {
        Thread.sleep(3000); // simulated delay
        return "Hello, " + message;
    }

    @Autowired
    UserRepository users;


    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String homePage() {
        return "index";
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public User login(String username) throws Exception{
        User user = Game.users.get(username);
        if (user == null) {
            throw new Exception("user is non-existent");
        } else {
            return user;
        }
    }

    @RequestMapping(path = "/register", method = RequestMethod.GET)
    public void register(User user) {
        
    }


}
