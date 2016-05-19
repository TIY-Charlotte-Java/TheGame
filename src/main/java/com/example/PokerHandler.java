package com.example;

import com.example.services.PokerMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.Map;

/**
 * Created by Ben on 5/19/16.
 */
public class PokerHandler extends TextWebSocketHandler {
    @Autowired
    private PokerMessageService pokerService;

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("New Connection.");
        pokerService.registerOpenConnection(session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        pokerService.registerCloseConnection(session);
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        pokerService.registerCloseConnection(session);
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
        System.out.println("New Message:" + message.getPayload());
        pokerService.processMessage(session, message.getPayload());
    }
}
