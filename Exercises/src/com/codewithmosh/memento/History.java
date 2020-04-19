package com.codewithmosh.memento;

import java.util.*;

public class History {
    Deque<Document> documents = new ArrayDeque<>();

    public void push(Document document){
        documents.add(document);
    }

    public Document pop(){
        if (documents.isEmpty())
            return null;

        return documents.removeLast();

    }
}
