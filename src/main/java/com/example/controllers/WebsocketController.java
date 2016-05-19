package com.example.controllers;

import com.example.entities.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.socket.WebSocketSession;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by Ben on 5/18/16.
 */
//@Controller
public class WebsocketController {


//    @SendTo("/card-data/cards")
//    @MessageMapping("/cards")
//    public void greeting(SimpMessageHeaderAccessor headerAccessor) throws Exception {
//        Map<String, Object> sessionAttrs = headerAccessor.getSessionAttributes();
//
//        template.convertAndSendToUser((String)sessionAttrs.get("userName"), "/card-data/cards", Card.buildDeck());
//    }
}
