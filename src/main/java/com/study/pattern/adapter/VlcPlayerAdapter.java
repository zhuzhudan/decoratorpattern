package com.study.pattern.adapter;

public class VlcPlayerAdapter implements MediaAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof VlcPlayerAdapter;
    }

    public void play(String fileName) {
        new VlcPlayer().play(fileName);
    }
}
