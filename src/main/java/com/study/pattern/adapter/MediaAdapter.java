package com.study.pattern.adapter;

public interface MediaAdapter {
    boolean support(Object adapter);
    void play(String fileName);
}
