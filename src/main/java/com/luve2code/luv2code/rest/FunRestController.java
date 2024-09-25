package com.luv2code.springdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // injecting properties from application.properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Team Name: " + teamName + " &  Coaches Name: " + coachName;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5K!";
    }
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Lucky Day";
    }

}
