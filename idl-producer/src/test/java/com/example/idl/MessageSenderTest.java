package com.example.idl;

import com.google.protobuf.Timestamp;
import com.trevari.user.events.UserSignedUpEvent.Payload;
import com.trevari.user.events.UserSignedUpEvent.UserSignedUpEvent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {

    MessageSender sut;

    @Test
    void name() {
        sut = new MessageSender();
        sut.send();
    }
}
