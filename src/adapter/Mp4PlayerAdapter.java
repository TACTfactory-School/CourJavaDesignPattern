/*
 * Mp4PlayerAdapter.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package adapter;

import adapter.external.Mp4Player;

public class Mp4PlayerAdapter implements MediaPlayer {

    private final Mp4Player player;

    public Mp4PlayerAdapter(final Mp4Player player) {
        this.player = player;
    }

    @Override
    public void play(String audioType, String fileName) {
        System.out.println("Adapter MP4 call internal method...");

        this.player.playMp4(fileName);
    }

    @Override
    public void pause() {
        //TODO
    }

    @Override
    public void stop() {
        //TODO
    }

}
