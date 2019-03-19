package com.study.pattern.adapter;

public class MediaPlayer extends AudioPlayer implements IOtherPlayer {
    public void playVlc(String fileName) {
        processPlay(fileName, VlcPlayerAdapter.class);
    }

    public void playMp4(String fileName) {
        processPlay(fileName, Mp4PlayerAdapter.class);
    }

    private void processPlay(String fileName, Class<? extends MediaAdapter> clazz){
        try {
            MediaAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                adapter.play(fileName);
            } else{
                System.out.println("无法播放该格式");
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
