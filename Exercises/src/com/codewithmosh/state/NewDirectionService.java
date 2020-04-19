package com.codewithmosh.state;

import java.util.Objects;

public class NewDirectionService {
    private TravalAssistance assistant;

    public NewDirectionService(TravalAssistance assistant) {
        this.assistant = assistant;
    }

    public Object getEta() {
        return assistant.getEta();
    }

    public Object getDirection(){
        return assistant.getDirection();
    }
}
