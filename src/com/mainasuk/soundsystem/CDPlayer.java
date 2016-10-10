package com.mainasuk.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by MainasuK on 2016-10-9.
 */

@Component
public class CDPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

    @Autowired
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    @Autowired
    public void insertCd(CompactDisc cd) {
        this.cd = cd;
    }
}
