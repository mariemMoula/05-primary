package com.mimilearning.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component //marks the class a spring bean
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Exercise from CricketCoach";
    }
}
