package com.luve2code.luv2code.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley for 15 minutes!!";
    }
}
