package dev.christianbaumann.password;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import dev.christianbaumann.password.Password;
import org.junit.jupiter.api.Test;

class PasswordTests {

    private Password password = new Password();

    @Test
    void emptyPasswordGetsRejected() {
        // Arrange
        String input = "";

        // Act
        boolean isValid = password.validatePasswordStrength(input);

        // Assert
        assertFalse(isValid);
    }

    @Test
    void tooShortPasswordWithNumberGetsRejected() {
        // Arrange
        String input = "password1";

        // Act
        boolean isValid = password.validatePasswordStrength(input);

        // Assert
        assertFalse(isValid);
    }

    @Test
    void tooShortPasswordWithoutNumberGetsRejected() {
        // Arrange
        String input = "password";

        // Act
        boolean isValid = password.validatePasswordStrength(input);

        // Assert
        assertFalse(isValid);
    }

    @Test
    void longEnoughPasswordWithoutNumberGetsRejected() {
        // Arrange
        String input = "aVeryLongPassword";

        // Act
        boolean isValid = password.validatePasswordStrength(input);

        // Assert
        assertFalse(isValid);
    }

    @Test
    void longEnoughPasswordWithNumberGetsAccepted() {
        // Arrange
        String input = "longPasswordWithA123";

        // Act
        boolean isValid = password.validatePasswordStrength(input);

        // Assert
        assertTrue(isValid);
    }
}
