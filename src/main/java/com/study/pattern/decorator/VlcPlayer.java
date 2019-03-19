package com.study.pattern.decorator;

public class VlcPlayer extends AudioPlayer{
    private AudioPlayer audioPlayer;

    public VlcPlayer(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void play(String fileName) {
        System.out.println("vlc正在播放，"+ fileName);
    }

}
