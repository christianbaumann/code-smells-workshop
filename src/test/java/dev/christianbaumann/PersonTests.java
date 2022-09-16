package dev.christianbaumann;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

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
