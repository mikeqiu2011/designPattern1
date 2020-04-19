package com.codewithmosh.strategy;

public class Demo {
    public static void main(String[] args) {
        ChatClient chatClient = new ChatClient(new DESEncryptor());
        chatClient.send("hi");
    }
}
