package com.codewithmosh.visitor;

public class ReduceNoiceOperation implements Operation {
    @Override
    public void execute(FactSegment segment) {
        System.out.println("reduce noice in FactSegment");
    }

    @Override
    public void execute(FormatSegment segment) {
        System.out.println("reduce noice in FormatSegment");
    }
}
