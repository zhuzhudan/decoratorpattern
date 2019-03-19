package com.study.pattern.decorator;

public class Mp4Player extends AudioPlayer {
    private AudioPlayer audioPlayer;

    public Mp4Player(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void play(String fileName) {
        System.out.println("mp4正在播放，" + fileName);
    }

}
