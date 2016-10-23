package com.mainasuk.soundsystem.config;
import com.mainasuk.soundsystem.BlankDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by MainasuK on 2016-10-23.
 */
@Configuration
@PropertySource("classpath:/com/mainasuk/soundsystem/app.properties")
public class ExpressiveCDConfig {

    @Autowired
    Environment environment;

    @Bean
    public BlankDisc disc() {
        return new BlankDisc(
                environment.getProperty("disc.title"),
                environment.getProperty("disc.artist")
        );
    }
}
