package com.mainasuk.soundsystem.config;

import com.mainasuk.soundsystem.CDPlayer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by MainasuK on 2016-10-9.
 */

@Configuration
@ComponentScan(basePackageClasses = { CDPlayer.class })
public class CDPlayerConfig {
}
