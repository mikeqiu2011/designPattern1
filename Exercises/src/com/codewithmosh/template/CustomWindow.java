package com.codewithmosh.template;

public class CustomWindow extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("before closing in custom windo");

    }

    @Override
    protected void afterClose() {
        System.out.println("after closing in custom windo");
    }
}
