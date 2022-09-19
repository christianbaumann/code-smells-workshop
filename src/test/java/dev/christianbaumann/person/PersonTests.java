package dev.christianbaumann.person;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PersonTests {

    @Test
    public void personAged16CanBuyAlcohol() {
        Person person = new Person();
        assertTrue(person.isOldEnoughToBuyAlcohol(16));
    }

    @Test
    public void personAged15CanNotBuyAlcohol() {
        Person person = new Person();
        assertFalse(person.isOldEnoughToBuyAlcohol(15));
    }
}
