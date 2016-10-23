package com.mainasuk.soundsystem.test;

import static org.junit.Assert.*;

import com.mainasuk.soundsystem.BlankDisc;
import com.mainasuk.soundsystem.CDPlayer;
import com.mainasuk.soundsystem.CompactDisc;
import com.mainasuk.soundsystem.config.CDPlayerConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by MainasuK on 2016-10-9.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CDPlayerConfig.class})
public class CDPlayerTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private CDPlayer player;

    @Autowired
    private CompactDisc cd;

    @Autowired
    private BlankDisc blankDisc;

    @Test
    public void testNoting() {
    }

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    /**
     * Test default autowired cd SgtPeppers
     */
    @Test
    public void play() {
        player.play();
        assertEquals(
                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",
                log.getLog());
    }

    @Test
    public void playBlankDisc() {
        blankDisc.play();
        assertEquals(
                "Playing Rattle and Hum by U2\n",
                log.getLog());
    }
}