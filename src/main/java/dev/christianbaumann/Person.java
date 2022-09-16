package dev.christianbaumann.person;

public class Person {

    public Boolean isOldEnoughToBuyAlcohol(int age) {
        if (age >= 16) {
            return true;
        } else {
            return false;
        }
    }
}

