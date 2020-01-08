package com.spring.framework;

import java.util.Random;

public class newFortuneClass implements FortuneService {

    @Override
    public String getFortune() {
        Random random = new Random();
        int number = random.nextInt(3);
        String arr[] = {"Megatron", "Optimus Prime", "Iron Hide"};

        return arr[number];
    }

}

