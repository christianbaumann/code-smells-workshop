package dev.christianbaumann.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonTests {

    @Test
    void personAged16CanBuyAlcohol() {
        // Arrange
        Person person = new Person();
        int age = 16;

        // Act
        boolean canBuyAlcohol = person.isOldEnoughToBuyAlcohol(age);

        // Assert
        assertTrue(canBuyAlcohol);
    }

    @Test
    void personAged15CanNotBuyAlcohol() {
        // Arrange
        Person person = new Person();
        int age = 15;

        // Act
        boolean canBuyAlcohol = person.isOldEnoughToBuyAlcohol(age);

        // Assert
        assertFalse(canBuyAlcohol);
    }
}
