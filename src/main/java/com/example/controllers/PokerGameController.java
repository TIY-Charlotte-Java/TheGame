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

import javax.servlet.http.HttpSession;

/**
 * Created by Ultramar on 5/17/16.
 */
@Controller
public class PokerGameController {
    @Autowired
    UserRepository users;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String homePage(HttpSession session) {
        return "index";
    }


    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public User login(String username) throws Exception {
        User user = Game.users.get(username);
        if (user == null) {
            throw new Exception("user is non-existent");
        } else {
            return user;
        }
    }

    @RequestMapping(path = "/register", method = RequestMethod.GET)
    public String registeration(HttpSession session) {
        return "registration";
    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public void register(HttpSession session) throws Exception {
        User user = new User();
        user.setUsername((String) session.getAttribute("userName"));
        user.setPassword((String) session.getAttribute("passWord"));
        user.seteMail((String) session.getAttribute("eMail"));
        user.setChipCount((Integer) session.getAttribute("chipCount"));

        if (!Game.users.containsKey(user.getUsername())) {
            Game.users.put(user.getUsername(), user);
        } else {
            throw new Exception("User already exists");
        }

    }

}




