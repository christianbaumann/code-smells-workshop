package dev.christianbaumann.password;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import dev.christianbaumann.password.Password;
import org.junit.jupiter.api.Test;

class PasswordTests {

    private Password password = new Password();

    @Test
    void emptyPasswordGetsRejected() {
        assertFalse(password.validatePasswordStrength(""));
    }

    @Test
    void tooShortPasswordWithNumberGetsRejected() {
        assertFalse(password.validatePasswordStrength("password1"));
    }

    @Test
    void tooShortPasswordWithoutNumberGetsRejected() {
        assertFalse(password.validatePasswordStrength("password"));
    }

    @Test
    void longEnoughPasswordWithoutNumberGetsRejected() {
        assertFalse(password.validatePasswordStrength("aVeryLongPassword"));
    }

    @Test
    void longEnoughPasswordWithNumberGetsAccepted() {
        assertTrue(password.validatePasswordStrength("longPasswordWithA123"));
    }
}
