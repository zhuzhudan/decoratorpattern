package com.study.pattern.decorator;

public class AudioPlayer implements IAudioPlayer {
    public void play(String fileName) {
        System.out.println("mp3文件正在播放，" + fileName);
    }
}
