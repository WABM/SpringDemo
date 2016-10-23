package com.mainasuk.soundsystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by MainasuK on 2016-10-23.
 */
@Configuration
@Import( {ExpressiveCDConfig.class} )
public class CDConfig {
}
