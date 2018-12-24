package com.jwt.handler;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class ChatHandler extends TextWebSocketHandler
{
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception
	{
		// TODO Auto-generated method stub
		super.handleTextMessage(session, message);
	}
}
