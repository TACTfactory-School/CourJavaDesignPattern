/*
 * VlcPlayerAdapter.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package adapter;

import adapter.external.VlcPlayer;

public class VlcPlayerAdapter implements MediaPlayer {

    private boolean isPlayed;
    private String filename;
    private int pausePosition;

    private final VlcPlayer player;

    public VlcPlayerAdapter(final VlcPlayer player) {
        this.player = player;
    }

    @Override
    public void play(String audioType, String fileName) {
        System.out.println("Adapter VLC call internal method...");

        this.isPlayed = true;
        this.player.playVlc(fileName, 0);
    }

    @Override
    public void pause() {
        if (this.isPlayed) {
            this.pausePosition = this.player.stopVlc();
        } else {
            this.player.playVlc(filename, this.pausePosition);
        }
    }

    @Override
    public void stop() {
        this.isPlayed = false;
        this.player.stopVlc();
    }

}
