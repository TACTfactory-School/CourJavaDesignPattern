/*
 * Mp3Player.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package adapter.internal;

import adapter.MediaPlayer;

public class Mp3Player implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        System.out.println("Playing MP3 file. Name: " + fileName);
    }

}
