package com.luve2code.luv2code.common;

import org.springframework.stereotype.Component;


@Component
public class CriketCoach implements Coach {
    public CriketCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!";
    }
}
