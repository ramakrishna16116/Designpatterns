package com.company;

public class Driver {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.playMusic("mp3", "beyond the horizon.mp3");
        audioPlayer.playMusic("mp4", "alone.mp4");
        audioPlayer.playMusic("vlc", "far far away.vlc");
        audioPlayer.playMusic("avi", "mind me.avi");
    }
}