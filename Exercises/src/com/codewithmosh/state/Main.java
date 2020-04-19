package com.codewithmosh.state;

public class Main {
    public static void main(String[] args) {
        NewDirectionService newDirectionService =
                new NewDirectionService(new BicyclingAssistant());

        newDirectionService.getDirection();
        newDirectionService.getEta();
    }
}
