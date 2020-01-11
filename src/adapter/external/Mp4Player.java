/*
 * Mp4Player.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package adapter.external;

public class Mp4Player {

    private String filename;

    public void playMp4(String filename) {
        this.filename = filename;

        System.out.println("Playing MP4 file. Name: " + this.filename);
    }

    public void play() {
        System.out.println("Re-Playing MP4 file. Name: " + this.filename);
    }

    public void pause() {
        System.out.println("Pause MP4 file. Name: " + this.filename);
    }

    public void stop() {
        System.out.println("Stop MP4 file. Name: " + this.filename);
    }
}
