/*
 * MyPlayer.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package adapter;

import adapter.external.Mp4Player;
import adapter.external.VlcPlayer;
import adapter.internal.Mp3Player;
import adapter.internal.OggPlayer;

public class MyPlayer {

    private MediaPlayer internalPlayer;

    public void play(String audioType, String fileName) {

        switch (audioType.toLowerCase()) {
            // inbuilt support to play mp3 music files.
            case MediaPlayer.FORMAT_MP3:
                this.internalPlayer = new Mp3Player();
                break;

            case MediaPlayer.FORMAT_OGG:
                this.internalPlayer = new OggPlayer();
                break;

            // Adapter is providing support to play other file formats.
            case MediaPlayer.FORMAT_VLC:
                this.internalPlayer = new VlcPlayerAdapter(new VlcPlayer());
                break;

            case MediaPlayer.FORMAT_MP4:
                this.internalPlayer = new Mp4PlayerAdapter(new Mp4Player());
                break;

            // In other case...
            default:
                this.internalPlayer = null;
                System.out.println("Invalid media. " + audioType + " format not supported");
                break;
        }

        if (this.internalPlayer != null) {
            this.internalPlayer.play(audioType, fileName);
        }
    }

}
