package com.mainasuk.soundsystem.config;

import com.mainasuk.soundsystem.SgtPeppers;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by MainasuK on 2016-10-9.
 */

@Configuration
@ComponentScan(basePackageClasses = { SgtPeppers.class })
public class CDPlayerConfig {
}