/*
 * MediaPlayer.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package adapter;

public interface MediaPlayer {

    public static final String FORMAT_MP3 = "mp3";
    public static final String FORMAT_OGG = "ogg";
    public static final String FORMAT_MP4 = "mp4";
    public static final String FORMAT_VLC = "vlc";


    void play(String audioType, String fileName);
    void pause();
    void stop();
}
