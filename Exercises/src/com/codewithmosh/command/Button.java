package com.codewithmosh.command;

public class Button {
    private Command cmd;

    public Button(Command cmd) {
        this.cmd = cmd;
    }

    public void clicked(){
        cmd.execute();
    }
}
