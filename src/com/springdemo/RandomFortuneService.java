package com.springdemo;

public class RandomFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        String[] arr = {
                "Good Luck 1",
                "Good Luck 2",
                "Good Luck 3",
        };
        return arr[(int)(Math.random() * arr.length)];
    }
}
