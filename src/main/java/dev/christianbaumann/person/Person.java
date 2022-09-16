package dev.christianbaumann;

public class Person {

    public Boolean isOldEnoughToBuyAlcohol(int age) {
        if (age >= 16) {
            return true;
        } else {
            return false;
        }
    }
}

