package com.codewithmosh.mediator;

public class Demo {
    public static void main(String[] args) {
        Button button = new Button();
        CheckBox checkBox = new CheckBox();
        TextBox textBox = new TextBox();

        MyDialog myDialog = new MyDialog(button,checkBox,textBox);
//        button.addObserver(myDialog);
//        checkBox.addObserver(myDialog);
//        textBox.addObserver(myDialog);

        button.setEnabled(true);
        textBox.setContent("hi");
        checkBox.setChecked(true);
    }
}
