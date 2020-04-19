package com.codewithmosh.visitor;

import java.util.ArrayList;
import java.util.List;

public class WavFile {
    private List<Segment> segments = new ArrayList<>();

    public static WavFile read(String fileName) {
        // Simulate reading a wav file and building the segments
        WavFile wavFile = new WavFile();
        wavFile.segments.add(new FormatSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());

        return wavFile;
    }

    public void execute(Operation operation){
        for (Segment segment : segments)
            segment.execute(operation);
    }

//    public void reduceNoise() {
//        for (Segment segment : segments)
//            segment.reduceNoise();
//    }
//
//    public void addReverb() {
//        for (Segment segment : segments)
//            segment.addReverb();
//    }
//
//    public void normalize() {
//        for (Segment segment : segments)
//            segment.normalize();
//    }
}
