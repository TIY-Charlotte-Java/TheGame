package com.example.services;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Ben on 5/19/16.
 */
@Service
public class PokerMessageService {
    private Set<WebSocketSession> conns = java.util.Collections.synchronizedSet(new HashSet<WebSocketSession>());

    public void registerOpenConnection(WebSocketSession session) {
        System.out.println("Adding session.");
        conns.add(session);
    }

    public void registerCloseConnection(WebSocketSession session) {
        System.out.println("Removing session.");
        conns.remove(session);
    }

    public void processMessage(WebSocketSession session, String message) throws IOException {
       for (WebSocketSession sock : conns) {
           sock.sendMessage(new TextMessage(message));
       }
    }
}
