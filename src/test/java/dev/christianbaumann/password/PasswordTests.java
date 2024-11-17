package dev.christianbaumann.password;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import dev.christianbaumann.password.Password;
import org.junit.jupiter.api.Test;

class PasswordTests {
    
    private Password password;

    @Test
    void rejectsEmptyPassword() {
        // Arrange
        String input = "";
        password = new Password(input);

        // Act
        boolean isValid = password.isPasswordValid();

        // Assert
        assertFalse(isValid);
    }

    @Test
    void rejectsTooShortPasswordWithNumber() {
        // Arrange
        String input = "password1";
        password = new Password(input);

        // Act
        boolean isValid = password.isPasswordValid();

        // Assert
        assertFalse(isValid);
    }

    @Test
    void rejectsTooShortPasswordWithoutNumber() {
        // Arrange
        String input = "password";
        password = new Password(input);

        // Act
        boolean isValid = password.isPasswordValid();

        // Assert
        assertFalse(isValid);
    }

    @Test
    void rejectsLongEnoughPasswordWithoutNumber() {
        // Arrange
        String input = "aVeryLongPassword";
        password = new Password(input);

        // Act
        boolean isValid = password.isPasswordValid();

        // Assert
        assertFalse(isValid);
    }

    @Test
    void acceptsLongEnoughPasswordWithNumber() {
        // Arrange
        String input = "longPasswordWithA123";
        password = new Password(input);

        // Act
        boolean isValid = password.isPasswordValid();

        // Assert
        assertTrue(isValid);
    }
}
