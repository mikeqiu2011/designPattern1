package com.codewithmosh.chainOfResponsibility;

public class Demo {
    public static void main(String[] args) {
        String fileName = "xxx.numbers";

        NumbersHandler numbersHandler = new NumbersHandler(null);
        ExcelHanlder excelHanlder = new ExcelHanlder(numbersHandler);

        excelHanlder.handle(fileName);

    }
}
