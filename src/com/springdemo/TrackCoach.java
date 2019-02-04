package com.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }


    public TrackCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }



    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartStuff(){
        System.out.println("TrackCoach: inside method doMyStartStuff");
    }

    // add an destroy method
    public void doMyCleanupStuff(){
        System.out.println("\nTrackCoach: inside method doMyCleanupStuff");
    }
}
