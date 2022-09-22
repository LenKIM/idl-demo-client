package com.example.idl;

public class MessageReceiver {

    void receiver(com.trevari.user.events.UserSignedUpEvent.UserSignedUpEvent a){
        System.out.println(a.toString());
    }
}
