package com.thehecklers.pscatch;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;

@MessageEndpoint
public class MessageProcessor {
    private Sink sink;

    public MessageProcessor(Sink sink) {
        this.sink = sink;
    }

    @StreamListener(Sink.INPUT)
    public void getMessage(Reading reading) {
        System.out.println(">>> Reading received: |" + reading.toString() + "|");
    }
}
