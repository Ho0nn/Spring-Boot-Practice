package com.luve2code.luv2code.rest;

import com.luve2code.luv2code.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;


     // define a constructor for dependency injection
    @Autowired  //optional when U only have one constructor
    public DemoController(@Qualifier("criketCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    // define setter method for dependency injection
//    @Autowired
//    public void setCoach( Coach coach){
//        myCoach=coach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
