package com.mainasuk.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by MainasuK on 2016-10-9.
 */

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Heats Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
