package dev.christianbaumann;

public class Person {


    private static final int AGE_TO_BUY_ALCOHOL = 16;

    public Boolean isOldEnoughToBuyAlcohol(int age) {
        if (age >= AGE_TO_BUY_ALCOHOL) {
            return true;
        } else {
            return false;
        }
    }
}

