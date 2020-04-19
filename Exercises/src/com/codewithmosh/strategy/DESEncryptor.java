package com.codewithmosh.strategy;

public class DESEncryptor implements Encryptor {
    @Override
    public void encrypt() {
        System.out.println("encrypt using DES");
    }
}
