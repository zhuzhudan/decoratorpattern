package com.study.pattern.adapter;

public class Test {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        player.play("song.mp3");
        player.playMp4("alone.mp4");
        player.playVlc("far far away.vlc");
    }
}
