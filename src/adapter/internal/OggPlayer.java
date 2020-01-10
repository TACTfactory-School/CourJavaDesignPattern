/*
 * OggPlayer.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package adapter.internal;

import adapter.MediaPlayer;

public class OggPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        System.out.println("Playing OGG file. Name: " + fileName);
    }

}
