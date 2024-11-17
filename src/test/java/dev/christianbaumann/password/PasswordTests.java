package dev.christianbaumann.password;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import dev.christianbaumann.password.Password;
import org.junit.jupiter.api.Test;

class PasswordTests {

    private Password password = new Password();

    @Test
    void rejectsEmptyPassword() {
        // Arrange
        String input = "";

        // Act
        boolean isValid = password.validatePasswordStrength(input);

        // Assert
        assertFalse(isValid);
    }

    @Test
    void rejectsTooShortPasswordWithNumber() {
        // Arrange
        String input = "password1";

        // Act
        boolean isValid = password.validatePasswordStrength(input);

        // Assert
        assertFalse(isValid);
    }

    @Test
    void rejectsTooShortPasswordWithoutNumber() {
        // Arrange
        String input = "password";

        // Act
        boolean isValid = password.validatePasswordStrength(input);

        // Assert
        assertFalse(isValid);
    }

    @Test
    void rejectsLongEnoughPasswordWithoutNumber() {
        // Arrange
        String input = "aVeryLongPassword";

        // Act
        boolean isValid = password.validatePasswordStrength(input);

        // Assert
        assertFalse(isValid);
    }

    @Test
    void acceptsLongEnoughPasswordWithNumber() {
        // Arrange
        String input = "longPasswordWithA123";

        // Act
        boolean isValid = password.validatePasswordStrength(input);

        // Assert
        assertTrue(isValid);
    }
}
