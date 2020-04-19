package com.codewithmosh.memento;

public class Originator {
    Document document;

    private History history;
    public Originator(Document document, History history) {
        this.document = document;
        this.history = history;
    }

    public void createState(Document document){
        history.push(this.document);
        this.document = document;

    }

    public void restore(){
        document = history.pop();
    }


    public Document getDocument() {
        return document;
    }

}
