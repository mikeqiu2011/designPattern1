package com.codewithmosh.visitor;

public interface Operation {
    void execute(FactSegment segment);
    void execute(FormatSegment segment);

}
