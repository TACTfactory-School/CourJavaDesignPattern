/*
 * Mp3Player.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package adapter.internal;

import adapter.MediaPlayer;

public class Mp3Player implements MediaPlayer {

    private String filename;

    @Override
    public void play(String audioType, String fileName) {
        this.filename = fileName;
        System.out.println("Playing MP3 file. Name: " + filename);
    }

    @Override
    public void pause() {
        System.out.println("Playing MP3 file. Name: " + this.filename);
    }

    @Override
    public void stop() {
        System.out.println("Playing MP3 file. Name: " + this.filename);
    }

}
