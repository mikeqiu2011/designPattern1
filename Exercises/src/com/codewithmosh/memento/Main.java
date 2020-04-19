package com.codewithmosh.memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator(
                new Document("1","1",1),
                new History());

        originator.createState(new Document("2","2",2));
        originator.createState(new Document("3","3",3));

//        originator.restore();
//        originator.restore();
//        originator.restore();

        Document document = originator.getDocument();
        System.out.println(document);


    }
}
