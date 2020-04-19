package com.codewithmosh.chainOfResponsibility;

public class NumbersHandler extends FileHanlder {
    public NumbersHandler(Handler next) {
        super(next);
    }

    @Override
    protected void doHandle(String text) {
//        if (text.endsWith(".numbers")){
            System.out.println("handling with Numbers");
//            return true;
//        }
//        return false;
    }

    @Override
    protected String getExtension() {
        return ".numbers";
    }
}
