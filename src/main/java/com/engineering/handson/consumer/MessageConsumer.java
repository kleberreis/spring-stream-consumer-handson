package com.engineering.handson.consumer;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {
	
	@StreamListener(Sink.INPUT)
	public void consumeMessage(@Payload String message) {
		System.out.println(message);
	}	
	
}
