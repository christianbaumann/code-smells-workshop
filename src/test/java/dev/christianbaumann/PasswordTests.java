package dev.christianbaumann.password;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import dev.christianbaumann.password.Password;
import org.junit.Test;

public class PasswordTests {

    private Password password = new Password();

    @Test
    public void emptyPasswordGetsRejected() {
        assertFalse(password.validatePasswordStrength(""));
    }

    @Test
    public void tooShortPasswordWithNumberGetsRejected() {
        assertFalse(password.validatePasswordStrength("password1"));
    }

    @Test
    public void tooShortPasswordWithoutNumberGetsRejected() {
        assertFalse(password.validatePasswordStrength("password"));
    }

    @Test
    public void longEnoughPasswordWithoutNumberGetsRejected() {
        assertFalse(password.validatePasswordStrength("aVeryLongPassword"));
    }

    @Test
    public void longEnoughPasswordWithNumberGetsAccepted() {
        assertTrue(password.validatePasswordStrength("longPasswordWithA123"));
    }
}
