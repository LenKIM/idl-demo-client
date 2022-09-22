package com.example.idl;

import com.google.protobuf.Timestamp;

public class MessageSender {

    void send() {

        com.trevari.user.events.UserSignedUpEvent.UserSignedUpEvent event = com.trevari.user.events.UserSignedUpEvent.UserSignedUpEvent.newBuilder()
                .setId(1L)
                .setOccurredAt(Timestamp.newBuilder().build())
                .setPayload(com.trevari.user.events.UserSignedUpEvent.Payload.newBuilder()
                        .setValue("{'test': '123'}")
                        .build())
                .build();

        System.out.println(event);
    }
}
