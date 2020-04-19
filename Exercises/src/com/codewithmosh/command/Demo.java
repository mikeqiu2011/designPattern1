package com.codewithmosh.command;

public class Demo {
    public static void main(String[] args) {
        Button button = new Button(new EditCommand());

        button.clicked();
    }
}
