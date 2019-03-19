package com.study.pattern.adapter;

public class Mp4PlayerAdapter implements MediaAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof Mp4PlayerAdapter;
    }

    public void play(String fileName) {
        new Mp4Player().play(fileName);
    }
}
