package com.spring.framework;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "This is Lucky Day";
    }

}
