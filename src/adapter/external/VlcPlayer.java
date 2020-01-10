/*
 * VlcPlayer.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package adapter.external;

public class VlcPlayer {

    private String filename;

    public void playVlc(String fileName) {
        System.out.println("Playing VLC file. Name: " + fileName);
    }

}
