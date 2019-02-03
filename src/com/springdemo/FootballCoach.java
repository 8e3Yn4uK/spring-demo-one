package com.springdemo;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach(){
    }
    public FootballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run and shoot!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
