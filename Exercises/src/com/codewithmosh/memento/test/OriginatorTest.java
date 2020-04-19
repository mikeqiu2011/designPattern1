package com.codewithmosh.memento.test;

import com.codewithmosh.memento.Document;
import com.codewithmosh.memento.History;
import com.codewithmosh.memento.Originator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OriginatorTest{
    private Originator originator;

    @BeforeEach
    void setUp() {
        originator = new Originator(
                new Document("1","1",1),
                new History());
        originator.createState(new Document("2","2",2));
        originator.createState(new Document("3","3",3));
    }


    @Test
    void testGetDocument() {
        Document document = originator.getDocument();
        Assertions.assertEquals(new Document("3","3",3),document);
    }

    @Test
    void testRestoreOnce() {
        originator.restore();
        Assertions.assertEquals(new Document("2","2",2),
                originator.getDocument());
    }

    @Test
    void testRestoreTwice() {
        originator.restore();
        originator.restore();
        Assertions.assertEquals(new Document("1","1",1),
                originator.getDocument());
    }

    @Test
    void testRestoreThice() {
        originator.restore();
        originator.restore();
        originator.restore();
        Assertions.assertEquals(null,
                originator.getDocument());
    }

}