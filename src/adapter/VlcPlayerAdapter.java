/*
 * VlcPlayerAdapter.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package adapter;

import adapter.external.VlcPlayer;

public class VlcPlayerAdapter implements MediaPlayer {

    private final VlcPlayer player;

    public VlcPlayerAdapter(final VlcPlayer player) {
        this.player = player;
    }

    @Override
    public void play(String audioType, String fileName) {
        System.out.println("Adapter VLC call internal method...");

        this.player.playVlc(fileName);
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
