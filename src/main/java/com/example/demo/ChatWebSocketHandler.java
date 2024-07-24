package com.example.demo;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class ChatWebSocketHandler extends TextWebSocketHandler{
     @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // Aqui você pode manipular as mensagens recebidas e enviar respostas
        session.sendMessage(new TextMessage("Olá, " + message.getPayload() + "!"));
    }
}
