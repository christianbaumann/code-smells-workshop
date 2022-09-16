package dev.christianbaumann.person;

public class Person {


    private static final int AGE_TO_BUY_ALCOHOL = 16;

    public Boolean isOldEnoughToBuyAlcohol(int age) {
        return age >= AGE_TO_BUY_ALCOHOL;
    }
}

