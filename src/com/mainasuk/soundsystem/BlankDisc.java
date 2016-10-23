package com.mainasuk.soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by MainasuK on 2016-10-23.
 */
@Component
@PropertySource("classpath:/com/mainasuk/soundsystem/app.properties")
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;

    public BlankDisc(
            @Value("${disc.title}") String title,
            @Value("${disc.artist}") String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
