package com.codewithmosh.strategy;

public class ChatClient {
    private Encryptor encryptor;

    public ChatClient(Encryptor e) {
        this.encryptor = e;
    }

    public void send(String message) {
        encryptor.encrypt();
    }
}
