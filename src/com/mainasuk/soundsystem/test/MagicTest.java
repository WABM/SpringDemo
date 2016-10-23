package com.mainasuk.soundsystem.test;

import com.mainasuk.soundsystem.bean.MagicBean;
import com.mainasuk.soundsystem.config.MagicExistsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * Created by MainasuK on 2016-10-17.
 */
public class MagicTest {

    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }
}
