package com.study.pattern.adapter;

public class VlcPlayer implements IMediaPlayer {
    public void play(String fileName) {
        System.out.println("vlc正在播放，"+ fileName);
    }
}
