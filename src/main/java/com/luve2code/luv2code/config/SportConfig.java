package com.luve2code.luv2code.config;

import com.luve2code.luv2code.common.Coach;
import com.luve2code.luv2code.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
