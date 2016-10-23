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
    private long productDateMillis;

    public BlankDisc(
            @Value("${disc.title}") String title,
            @Value("${disc.artist}") String artist,
            @Value("#{T(System).currentTimeMillis()}") long timeMillis ) {
        this.title = title;
        this.artist = artist;
        this.productDateMillis = timeMillis;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public long getProductDateMillis() {
        return productDateMillis;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
