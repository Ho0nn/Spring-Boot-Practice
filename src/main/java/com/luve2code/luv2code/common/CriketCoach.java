package com.luve2code.luv2code.common;

import org.springframework.stereotype.Component;


@Component
public class CriketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!";
    }
}
