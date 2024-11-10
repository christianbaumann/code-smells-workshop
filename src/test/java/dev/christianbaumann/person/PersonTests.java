package dev.christianbaumann.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonTests {

    @Test
    void personAged16CanBuyAlcohol() {
        Person person = new Person();
        assertTrue(person.isOldEnoughToBuyAlcohol(16));
    }

    @Test
    void personAged15CanNotBuyAlcohol() {
        Person person = new Person();
        assertFalse(person.isOldEnoughToBuyAlcohol(15));
    }
}
