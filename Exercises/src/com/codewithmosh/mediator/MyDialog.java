package com.codewithmosh.mediator;

public class MyDialog{
    private Button button;
    private CheckBox checkBox;
    private TextBox textBox;

    public MyDialog(Button button, CheckBox checkBox, TextBox textBox) {
        this.button = button;
        this.checkBox = checkBox;
        this.textBox = textBox;

        button.addObserver(this::buttonUpdate);
        checkBox.addObserver(this::checkBoxUpdate);
        textBox.addObserver(this::textBoxUpdate);
    }


    private void buttonUpdate(){
        System.out.println("button updated");
    }

    private void checkBoxUpdate(){
        System.out.println("checkBox updated");
    }

    private void textBoxUpdate(){
        System.out.println("textBox updated");
    }
}
