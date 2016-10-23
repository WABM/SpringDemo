package com.mainasuk.soundsystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by MainasuK on 2016-10-9.
 */

@Component
@Primary
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
