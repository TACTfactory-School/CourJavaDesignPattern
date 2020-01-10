/*
 * AdapterPatternDemo.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package adapter;

import adapter.external.Mp4Player;

public class AdapterPatternDemo {

    public static void main(String[] args) {

        // Main target.
        final MyPlayer audioPlayer = new MyPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

        // Just for Validate.
        final Mp4Player playerNative = new Mp4Player();
        playerNative.playMp4("test.mp4");

        final Mp4PlayerAdapter playerAdapted = new Mp4PlayerAdapter(playerNative);
        playerAdapted.play("mp4", "test.mp4");

    }

}
