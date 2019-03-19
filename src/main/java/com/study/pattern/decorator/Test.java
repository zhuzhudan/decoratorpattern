package com.study.pattern.decorator;

public class Test {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new Mp4Player(new AudioPlayer());
        audioPlayer.play("song");

        audioPlayer = new VlcPlayer(new AudioPlayer());
        audioPlayer.play("alone");
    }
}
