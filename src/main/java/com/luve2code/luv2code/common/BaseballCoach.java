package com.luve2code.luv2code.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}
