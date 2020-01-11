/*
 * VlcPlayer.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package adapter.external;

public class VlcPlayer {

    private String filename;
    private int position;

    public void playVlc(String filename, int postition) {
        this.filename = filename;
        this.position = postition + 10;

        System.out.println("Playing VLC file. Name: " + this.filename + " at : " + postition);
    }

    public int stopVlc() {
        System.out.println("Stoping VLC file. Name: " + this.filename + " at : " + this.position);

        int stopedPosition = this.position;

        // Reset value
        this.position = 0;
        this.filename = null;

        return stopedPosition;
    }
}
