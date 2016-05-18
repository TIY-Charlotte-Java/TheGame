package com.example.controllers;

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

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String homePage() {
        return "index";
    }
}
