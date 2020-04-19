package com.codewithmosh.command;

public class EditCommand implements Command {
    private VideoEditor videoEditor = new VideoEditor();

    @Override
    public void execute() {
        System.out.println("execurint in cmd");
        System.out.println(videoEditor.getContrast());
    }
}
