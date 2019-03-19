package com.study.pattern.adapter;

public class Mp4Player implements IMediaPlayer {
    public void play(String fileName) {
        System.out.println("mp4正在播放，" + fileName);
    }
}
