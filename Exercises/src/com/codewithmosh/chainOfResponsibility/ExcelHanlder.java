package com.codewithmosh.chainOfResponsibility;

public class ExcelHanlder extends FileHanlder {
    public ExcelHanlder(Handler next) {
        super(next);
    }

    @Override
    protected void doHandle(String text) {
//        if (text.endsWith("xls")){
            System.out.println("handling using excel");
//            return true;
//        }
//        return false;
    }

    @Override
    protected String getExtension() {
        return ".xls";
    }
}
