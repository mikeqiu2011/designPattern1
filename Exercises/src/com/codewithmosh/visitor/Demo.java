package com.codewithmosh.visitor;

public class Demo {
    public static void main(String[] args) {
        WavFile wavFile = WavFile.read("1.wav");

        wavFile.execute(new ReduceNoiceOperation());
        wavFile.execute(new ReduceNoiceOperation());
    }
}
